package com.aman.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aman.ems.entity.BankEntity;

@Repository
public interface BankRepository extends JpaRepository<BankEntity, Integer>{

}
