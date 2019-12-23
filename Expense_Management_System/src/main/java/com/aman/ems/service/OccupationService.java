package com.aman.ems.service;

import com.aman.ems.entity.OccupationEntity;

public interface OccupationService {
	public OccupationEntity getOccupationByID(Integer id) throws Exception;
	public Long getSalaryByOId(Integer id) throws Exception;
	public OccupationEntity addNewOccupation(OccupationEntity o) throws Exception;
}
