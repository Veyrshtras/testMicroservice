package com.example.lesson2crud.service;


import com.example.lesson2crud.model.PostForm;
import com.example.lesson2crud.model.PostItem;
import com.example.lesson2crud.model.PostListItem;

import java.util.List;

public interface PostService {
    List<PostListItem> list();

    PostItem get(Long id);

    PostItem add(PostForm postForm);

    PostItem update(Long id, PostForm postForm);

    boolean delete(Long id);
}
