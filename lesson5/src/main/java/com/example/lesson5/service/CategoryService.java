package com.example.lesson5.service;

import com.example.lesson5.model.CategoryItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Page<CategoryItem> findAll(Pageable pageable);

    CategoryItem findOne(Long id);

    CategoryItem add(CategoryItem categoryItem);

    CategoryItem update(Long id, CategoryItem categoryItem);

    boolean delete(Long id);
}
