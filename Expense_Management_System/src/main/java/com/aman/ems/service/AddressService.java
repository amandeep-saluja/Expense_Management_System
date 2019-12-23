package com.aman.ems.service;

import com.aman.ems.entity.AddressEntity;
import com.aman.ems.entity.UserEntity;
import com.aman.ems.exception.EmsException;

public interface AddressService {
	/**
	 * Gets address of a user by address id
	 * 
	 * @param id, id of address
	 * @return AddressEntity object
	 * @throws EmsException
	 */
	public AddressEntity getAddressByAddressId(Integer id) throws EmsException;

	/**
	 * Gets User object by user id
	 * 
	 * @param id, id of user
	 * @return user object
	 * @throws EmsException
	 */
	public UserEntity getUserById(Integer id) throws EmsException;

	/**
	 * Gets True or False boolean value of existence of address
	 * 
	 * @param address object
	 * @return True or False
	 * @throws EmsException
	 */
	public Boolean addressExists(AddressEntity address) throws EmsException;

	/**
	 * Add new address in the database.
	 * 
	 * @param address object
	 * @return address object with address id
	 * @throws EmsException
	 */
	public AddressEntity addNewAddress(AddressEntity address) throws EmsException;
}
