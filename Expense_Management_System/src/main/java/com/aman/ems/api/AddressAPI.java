package com.aman.ems.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aman.ems.controller.AddressController;
import com.aman.ems.model.Address;
import com.aman.ems.model.User;

@CrossOrigin
@RequestMapping(value = "/address")
@RestController
@PropertySource("classpath:configuration.properties")
public class AddressAPI {

	@Autowired
	private AddressController addressController;

	@Autowired
	private Environment environment;

	static Logger log = LogManager.getLogger(AddressAPI.class.getName());

	@RequestMapping(value = "/getById", method = RequestMethod.GET)
	public ResponseEntity<Address> getAddressByAddressId(@RequestParam("id") Integer id) throws Exception {
		Address address = null;
		try {
			address = addressController.getAddressByAddressId(id);
			log.info("FETCHING ADDRESS BY ID SUCCESSFULLY WITH ID:" + id);
			ResponseEntity<Address> resp = new ResponseEntity<>(address, HttpStatus.OK);
			return resp;
		} catch (Exception e) {
			address = new Address();
			address.setMessage(environment.getProperty(e.getMessage()));
			log.info("EXCEPTION OCCURED: " + e.getMessage());
			return new ResponseEntity<Address>(address, HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/getUserById", method = RequestMethod.GET)
	public ResponseEntity<User> getUserByAddressId(@RequestParam("id") Integer id) throws Exception {
		User user = null;
		try {
			user = addressController.getUserById(id);
			log.info("FETCHING USER BY ADDRESS ID SUCCESSFULLY WITH ID:" + id);
			ResponseEntity<User> resp = new ResponseEntity<>(user, HttpStatus.OK);
			return resp;
		} catch (Exception e) {
			user = new User();
			user.setMessage(environment.getProperty(e.getMessage()));
			log.info("EXCEPTION OCCURED: " + e.getMessage());
			return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/addressExistsById", method = RequestMethod.GET)
	public ResponseEntity<String> addressExists(@RequestBody Address address) throws Exception {
		Boolean b = false;
		String msg = "NOT FOUND";
		try {
			b = addressController.addressExists(address);
			if (b == true) {
				msg = "FOUND";
				log.info("FETCHING ADDRESS BY ID SUCCESSFULLY");
			}
			return new ResponseEntity<>(msg, HttpStatus.OK);
		} catch (Exception e) {
			log.info("EXCEPTION OCCURED: " + e.getMessage());
			return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/addNew", method = RequestMethod.POST)
	public ResponseEntity<Address> addNewAddress(Address address) throws Exception {
		Address address2 = null;
		try {
			address2 = addressController.addNewAddress(address);
			return new ResponseEntity<>(address2, HttpStatus.OK);
		} catch (Exception e) {
			log.info("EXCEPTION OCCURED: " + e.getMessage());
			return new ResponseEntity<Address>(address2, HttpStatus.NOT_FOUND);
		}
	}

}
