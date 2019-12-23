package com.aman.ems.service;

import java.util.List;

import com.aman.ems.entity.CategoryEntity;

public interface CategoryService {
	public CategoryEntity getCategoryById(Integer id) throws Exception;
	public List<CategoryEntity> getAllCategory() throws Exception;
	public CategoryEntity getCategoryByName(String name) throws Exception;
	public CategoryEntity addNewCategory(CategoryEntity category) throws Exception;
	public List<String> getAllCategoryType() throws Exception;
}
