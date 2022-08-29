package com.example.lesson5.model;

import com.example.lesson5.entity.Category;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CategoryItem {
    private Long id;
    private String name;
    public static CategoryItem fromCategory(Category category){
        CategoryItem item=new CategoryItem();
        item.setId(category.getId());
        item.setName(category.getName());
        return item;
    }
}
