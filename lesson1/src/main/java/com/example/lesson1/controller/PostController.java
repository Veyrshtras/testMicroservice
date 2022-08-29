package com.example.lesson1.controller;

import com.example.lesson1.model.Post;
import com.example.lesson1.services.PostService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/post")
public class PostController {
    private final PostService postService;

    public PostController( PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public ResponseEntity list(){
        return ResponseEntity.ok(postService.list() );
    }
    @GetMapping("{id}")
    public ResponseEntity get(@PathVariable Long id){
        return ResponseEntity.ok(postService.get(id));
    }

    @PostMapping
    public ResponseEntity add(@RequestBody Post post){
        return ResponseEntity.ok(postService.add(post));
    }

    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Post post){
        return ResponseEntity.ok(postService.update(id, post));
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return ResponseEntity.ok(postService.delete(id));
    }
}
