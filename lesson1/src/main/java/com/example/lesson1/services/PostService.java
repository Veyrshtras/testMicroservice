package com.example.lesson1.services;

import com.example.lesson1.model.Post;

import java.util.ArrayList;
import java.util.List;

public interface PostService {

    Post add(Post post);

    Post update(Long id, Post post);

    boolean delete(Long id);

    Post get(Long id);

    List<Post> list();
}
