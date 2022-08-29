package com.example.lesson2crud.controller;

import com.example.lesson2crud.model.PostForm;
import com.example.lesson2crud.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("post")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public ResponseEntity list(){
        return ResponseEntity.ok(postService.list());
    }

    @GetMapping("{id}")
    public ResponseEntity get(@PathVariable Long id){
        return ResponseEntity.ok((postService.get(id)));
    }

    @PostMapping
    public ResponseEntity add(@RequestBody PostForm postForm){
        return ResponseEntity.ok(postService.add(postForm));
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody PostForm postForm){
        return ResponseEntity.ok(postService.update(id, postForm));
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable long id){
        postService.delete(id);
        return true;
    }

}
