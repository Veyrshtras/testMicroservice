package com.example.lesson5.service.impl;

import com.example.lesson5.entity.Category;
import com.example.lesson5.model.CategoryItem;
import com.example.lesson5.repository.CategoryRepository;
import com.example.lesson5.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Page<CategoryItem> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable)
                .map(CategoryItem::fromCategory);
    }

    @Override
    public CategoryItem findOne(Long id) {
        return CategoryItem.fromCategory(categoryRepository.getById(id));
    }

    @Override
    public CategoryItem add(CategoryItem categoryItem) {
        Category item=new Category();
        item.setName(categoryItem.getName());
        return CategoryItem.fromCategory(categoryRepository.save(item));
    }

    @Override
    public CategoryItem update(Long id, CategoryItem categoryItem) {
        Category category=categoryRepository.getById(id);
        category.setName(categoryItem.getName());
        return CategoryItem.fromCategory(categoryRepository.save(category));
    }

    @Override
    public boolean delete(Long id) {
//        Category optionalCategory=categoryRepository.findById(id).get();
//        if (optionalCategory==null)
//            return false;
//        else {
            categoryRepository.delete(categoryRepository.getById(id));
            return true;
//        }
    }
}
