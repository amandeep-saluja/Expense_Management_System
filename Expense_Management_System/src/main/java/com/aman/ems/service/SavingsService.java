package com.aman.ems.service;

import java.util.List;

import com.aman.ems.entity.CategoryEntity;
import com.aman.ems.entity.SavingsEntity;

public interface SavingsService {
	public List<SavingsEntity> getAllSavingsById(Integer id) throws Exception;
	public SavingsEntity getSavingsById(Integer id) throws Exception;
	public List<SavingsEntity> getAllSavingsByCategory(CategoryEntity category) throws Exception;
	public SavingsEntity addNewSavings(SavingsEntity savings) throws Exception;
}
