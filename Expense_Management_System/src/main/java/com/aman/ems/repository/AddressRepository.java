package com.aman.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aman.ems.entity.AddressEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Integer>{
	
}
