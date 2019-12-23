package com.aman.ems.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aman.ems.dto.transform.AddressTransformer;
import com.aman.ems.entity.AddressEntity;
import com.aman.ems.entity.UserEntity;
import com.aman.ems.exception.EmsException;
import com.aman.ems.model.Address;
import com.aman.ems.model.User;
import com.aman.ems.repository.AddressRepository;
import com.aman.ems.repository.UserRepository;
import com.aman.ems.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private UserRepository userRepo;
	
	/**
	 * 
	 * @param Id
	 * @return Address
	 */
	@Override
	public AddressEntity getAddressByAddressId(Integer id) throws EmsException{
		Optional<AddressEntity> addressEntity = null;
		addressEntity = addressRepository.findById(id);
		if(addressEntity.isPresent()) {
			System.out.println("-------------"+addressEntity.get().getAddressId());
			return addressEntity.get();
		}
		else
			throw new EmsException("AddressService.ADDRESS_NOT_FOUND_BY_ID");
	}

	@Override
	public UserEntity getUserById(Integer id) throws EmsException{
		UserEntity userEntity = null;
		List<UserEntity> list = null;
		list = userRepo.findAll();
		if(list!=null) {
			for(UserEntity u:list) {
				if(u.getAddress()!=null) {
					if(u.getAddress().getAddressId().intValue()==id) {
						userEntity=u;
						return userEntity;
					}
				}
			}
		}
		throw new EmsException("AddressService.ADDRESS_NOT_FOUND_BY_USER_ID");
	}

	@Override
	public Boolean addressExists(AddressEntity address) throws EmsException{
		if(addressRepository.existsById(address.getAddressId()))
			return true;
		throw new EmsException("AddressService.ADDRESS_NOT_FOUND_BY_ID");
	}

	@Override
	public AddressEntity addNewAddress(AddressEntity address) throws EmsException{
		AddressEntity saved = addressRepository.save(address);
		return saved;
	}

	

}
