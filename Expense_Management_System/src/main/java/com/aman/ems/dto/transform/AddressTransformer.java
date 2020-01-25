package com.aman.ems.dto.transform;

import com.aman.ems.entity.AddressEntity;
import com.aman.ems.exception.EmsException;
import com.aman.ems.model.Address;

/**
 * This class is used to convert data transfer objects into one another.
 * 
 * @author Amandeep Singh Saluja
 *
 */

public class AddressTransformer {
	
	/**
	 * Static method to convert AddressEntity to Address
	 * 
	 * @param addressEntity
	 * @return address
	 * @throws EmsException
	 */
	public static Address addressEntityToAddress(AddressEntity addressEntity) throws EmsException{
		Address address = new Address();
		if(addressEntity!=null) {
			address.setAddressId(addressEntity.getAddressId());
			address.setArea(addressEntity.getArea());
			address.setBuildingName(addressEntity.getBuildingName());
			address.setCity(addressEntity.getCity());
			address.setCountry(addressEntity.getCountry());
			address.setHouseNumber(addressEntity.getHouseNumber());
			address.setLandmark(addressEntity.getLandmark());
			address.setPincode(addressEntity.getPincode());
			address.setState(addressEntity.getState());
		}
		return address;
	}
	
	/**
	 * 
	 * Static method to convert Address to AddressEntity
	 * 
	 * @param address
	 * @return addressEntity
	 * @throws EmsException
	 */
	public static AddressEntity addressToAddressEntity(Address address) throws EmsException {
		AddressEntity addressEntity = new AddressEntity();
		if(address!=null) {
			addressEntity.setAddressId(address.getAddressId());
			addressEntity.setArea(address.getArea());
			addressEntity.setBuildingName(address.getBuildingName());
			addressEntity.setCity(address.getCity());
			addressEntity.setCountry(address.getCountry());
			addressEntity.setHouseNumber(address.getHouseNumber());
			addressEntity.setLandmark(address.getLandmark());
			addressEntity.setPincode(address.getPincode());
			addressEntity.setState(address.getState());			
		}
		return addressEntity;
	}
}
