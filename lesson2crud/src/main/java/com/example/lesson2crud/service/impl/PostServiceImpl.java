package com.example.lesson2crud.service.impl;

import com.example.lesson2crud.entity.Post;
import com.example.lesson2crud.model.PostForm;
import com.example.lesson2crud.model.PostItem;
import com.example.lesson2crud.model.PostListItem;
import com.example.lesson2crud.repository.PostRepository;
import com.example.lesson2crud.service.PostService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostListItem> list() {
        return postRepository.findAll()
                .stream()
                .map(PostListItem::fromPost)
                .collect(Collectors.toList());
    }

    @Override
    public PostItem get(Long id) {
        return PostItem.fromPost(postRepository.getOne(id));
    }

    @Override
    public PostItem add(PostForm postForm) {
        Post post=new Post();
        post.setContent(postForm.getContent());
        post.setTitle(postForm.getTitle());
        postRepository.save(post);
        return PostItem.fromPost(postRepository.save(post));
    }

    @Override
    public PostItem update(Long id, PostForm postForm) {
        Post post=postRepository.getById(id);
        post.setContent(postForm.getContent());
        post.setTitle(postForm.getTitle());
        postRepository.save(post);
        return PostItem.fromPost(postRepository.save(post));
    }

    @Override
    public boolean delete(Long id) {
        postRepository.deleteById(id);
        return true;
    }
}
