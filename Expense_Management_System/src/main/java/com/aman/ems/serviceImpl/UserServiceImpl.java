package com.aman.ems.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aman.ems.entity.AddressEntity;
import com.aman.ems.entity.OccupationEntity;
import com.aman.ems.entity.UserEntity;
import com.aman.ems.repository.UserRepository;
import com.aman.ems.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserEntity getUserByName(String fname, String lname) throws Exception{
		UserEntity user = null;
		user = userRepository.findByFirstNameAndLastName(fname,lname);
		if(user==null)
			throw new Exception("User not found.");
		return user;
	}

	@Override
	public UserEntity getUserById(Integer id) throws Exception{
		Optional<UserEntity> user = null;
		user = userRepository.findById(id);
		return null;
	}

	@Override
	public UserEntity userExists(UserEntity user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> getAllUsers() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressEntity getAddressByUID(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OccupationEntity getOccupationByUID(Integer id)  throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity addNewUser(UserEntity user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> getAllFriends()  throws Exception{
		// TODO Auto-generated method stub
		return null;
	}
}
