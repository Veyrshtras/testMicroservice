package com.example.lesson5.controller;

import com.example.lesson5.model.CategoryItem;
import com.example.lesson5.service.CategoryService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity findAll(Pageable pageable){
        return ResponseEntity.ok(categoryService.findAll(pageable));
    }

    @GetMapping("{id}")
    public ResponseEntity findOne(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.findOne(id));
    }
     @PostMapping
    public ResponseEntity add(@RequestBody CategoryItem categoryItem){
        return ResponseEntity.ok(categoryService.add(categoryItem));
     }
     @PutMapping("{id}")
    public ResponseEntity update(@RequestBody CategoryItem categoryItem, @PathVariable Long id){
        return ResponseEntity.ok(categoryService.update(id, categoryItem));
     }

     @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable Long id) {
         return ResponseEntity.ok(categoryService.delete(id));
     }
}
