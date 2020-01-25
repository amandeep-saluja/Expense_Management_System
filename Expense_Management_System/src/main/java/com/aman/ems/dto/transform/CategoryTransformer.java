package com.aman.ems.dto.transform;

import java.util.ArrayList;
import java.util.List;

import com.aman.ems.entity.CategoryEntity;
import com.aman.ems.exception.EmsException;
import com.aman.ems.model.Category;

/**
 * This class is used to convert Category Entity Object to Category Object and
 * Category Object to Category Entity Object.
 * 
 * @author Amandeep Singh Saluja
 *
 */

public class CategoryTransformer {

	/**
	 * This static method is used to convert Category Entity To Category Object.
	 * 
	 * @param categoryEntity
	 * @return Category Object
	 * @throws EmsException
	 */

	public static Category categoryEntityToCategory(CategoryEntity categoryEntity) throws EmsException {
		Category category = new Category();
		category.setCategoryId(categoryEntity.getCategoryId());
		category.setCategoryName(categoryEntity.getCategoryName());
		return category;
	}

	/**
	 * This static method is used to convert Category To CategoryEntity Object.
	 * 
	 * @param category
	 * @return CategoryEntity
	 * @throws EmsException
	 */

	public static CategoryEntity categoryToCategoryEntity(Category category) throws EmsException {
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setCategoryId(category.getCategoryId());
		categoryEntity.setCategoryName(categoryEntity.getCategoryName());
		return categoryEntity;
	}

	/**
	 * This static method is used to convert List of Category Entity to List of
	 * Category Object.
	 * 
	 * @param listOfCategory
	 * @return List<Category>
	 * @throws EmsException
	 */

	public static List<Category> listOfCategoryEntityToListOfCategory(List<CategoryEntity> listOfCategoryEntities)
			throws EmsException {
		List<Category> listOfCategory = new ArrayList<>();
		Category category = null;
		for (CategoryEntity categoryEntity : listOfCategoryEntities) {
			category = CategoryTransformer.categoryEntityToCategory(categoryEntity);
			listOfCategory.add(category);
		}
		return listOfCategory;
	}

	/**
	 * This static method is used to convert List of Category to List of
	 * CategoryEntity Object.
	 * 
	 * @param listOfCategory
	 * @return List<CategoryEntity>
	 * @throws EmsException
	 */

	public static List<CategoryEntity> listOfCategoryToListOfCategoryEntity(List<Category> listOfCategory)
			throws EmsException {
		List<CategoryEntity> listOfCategoryEntities = new ArrayList<>();
		CategoryEntity categoryEntity = null;
		for (Category category : listOfCategory) {
			categoryEntity = CategoryTransformer.categoryToCategoryEntity(category);
			listOfCategoryEntities.add(categoryEntity);
		}
		return listOfCategoryEntities;
	}

}
