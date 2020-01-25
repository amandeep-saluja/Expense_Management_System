package com.aman.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aman.ems.dto.transform.AddressTransformer;
import com.aman.ems.dto.transform.UserTransformer;
import com.aman.ems.entity.AddressEntity;
import com.aman.ems.entity.UserEntity;
import com.aman.ems.exception.EmsException;
import com.aman.ems.model.Address;
import com.aman.ems.model.User;
import com.aman.ems.serviceImpl.AddressServiceImpl;

/**
 * This class is used to Convert Entity to model classes and some other
 * important activities.
 * 
 * @author Amandeep Singh Saluja
 *
 */

@Controller
public class AddressController {

	@Autowired
	private AddressServiceImpl addressServiceImpl;

	/**
	 * Gets address of a user by address id
	 * 
	 * @param id, id of address
	 * @return AddressEntity object
	 * @throws EmsException
	 */
	public Address getAddressByAddressId(Integer id) throws EmsException {
		AddressEntity addressEntity = null;
		Address address = null;
		try {
			addressEntity = addressServiceImpl.getAddressByAddressId(id);
			if (addressEntity != null)
				address = AddressTransformer.addressEntityToAddress(addressEntity);
		} catch (Exception e) {
			System.out.println("Exception Occured: " + e.getMessage());
			throw e;
		}
		return address;
	}

	/**
	 * Gets User object by user id
	 * 
	 * @param id, id of user
	 * @return user object
	 * @throws EmsException
	 */
	public User getUserById(Integer id) throws EmsException {
		User user = null;
		UserEntity userEntity = null;
		try {
			userEntity = addressServiceImpl.getUserById(id);
			if (userEntity != null)
				user = UserTransformer.UserEntityToUser(userEntity);
		} catch (Exception e) {
			System.out.println("Exception Occured: " + e.getMessage());
			throw e;
		}
		return user;
	}

	/**
	 * Gets True or False boolean value of existence of address
	 * 
	 * @param address object
	 * @return True or False
	 * @throws EmsException
	 */
	public Boolean addressExists(Address address) throws EmsException {
		Boolean b = false;
		try {
			AddressEntity addressEntity = AddressTransformer.addressToAddressEntity(address);
			if (addressEntity != null)
				b = addressServiceImpl.addressExists(addressEntity);
		} catch (Exception e) {
			System.out.println("Exception Occured: " + e.getMessage());
			throw e;
		}
		return b;
	}

	/**
	 * Add new address in the database.
	 * 
	 * @param address object
	 * @return address object with address id
	 * @throws EmsException
	 */
	public Address addNewAddress(Address address) throws EmsException {
		AddressEntity addressEntity1 = null;
		AddressEntity addressEntity2 = null;
		try {
			addressEntity1 = AddressTransformer.addressToAddressEntity(address);
			addressEntity2 = addressServiceImpl.addNewAddress(addressEntity1);
			if (addressEntity2 != null)
				return AddressTransformer.addressEntityToAddress(addressEntity2);
		} catch (Exception e) {
			System.out.println("Exception Occured: " + e.getMessage());
			throw e;
		}
		return null;
	}
}
