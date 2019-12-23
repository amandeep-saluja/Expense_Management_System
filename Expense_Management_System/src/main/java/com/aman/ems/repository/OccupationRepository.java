package com.aman.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aman.ems.entity.OccupationEntity;

@Repository
public interface OccupationRepository extends JpaRepository<OccupationEntity, Integer>{

}
