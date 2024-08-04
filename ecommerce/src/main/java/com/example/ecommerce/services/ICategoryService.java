package com.example.ecommerce.services;

import com.example.ecommerce.dtos.CategoryDTO;
import com.example.ecommerce.models.Category;

import java.util.List;

public interface ICategoryService {
    void createCategory(CategoryDTO category);
    Category getCategoryById(long id);
    List<Category> getAllCategories();
    void updateCategory(long categoryId, CategoryDTO category);
    void deleteCategory(long id);
}
