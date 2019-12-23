package com.aman.ems.service;

import java.util.List;

import com.aman.ems.entity.AddressEntity;
import com.aman.ems.entity.OccupationEntity;
import com.aman.ems.entity.UserEntity;

public interface UserService {
	public UserEntity getUserByName(String fname,String lname) throws Exception;
	public UserEntity getUserById(Integer id) throws Exception;
	public UserEntity userExists(UserEntity user) throws Exception;
	public List<UserEntity> getAllUsers() throws Exception;
	public AddressEntity getAddressByUID(Integer id) throws Exception;
	public OccupationEntity getOccupationByUID(Integer id) throws Exception;
	public UserEntity addNewUser(UserEntity user) throws Exception;
	public List<UserEntity> getAllFriends() throws Exception; 
}
