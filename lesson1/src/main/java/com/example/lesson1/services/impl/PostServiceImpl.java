package com.example.lesson1.services.impl;

import com.example.lesson1.model.Post;
import com.example.lesson1.services.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PostServiceImpl implements PostService {

    List<Post> posts=new ArrayList<>();
    private AtomicLong counter=new AtomicLong(1);
    @Override
    public Post add(Post post) {
        post.setId(counter.getAndIncrement());
        posts.add(post);
        return post;
    }

    @Override
    public Post update(Long id, Post post) {

        for (int i=0;i<posts.size();i++){
            if(posts.get(i).getId().equals(post.getId())){
                posts.set(i,post);
                break;
            }
        }
        return post;
    }

    @Override
    public boolean delete(Long id) {
        int index=-1;
        for (int i=0;i<posts.size();i++){
            if(posts.get(i).getId().equals(id)){
                index=i;
                break;
            }
        }
        if(index!=-1){
            posts.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Post get(Long id) {
        int index=-1;
        for (int i=0;i<posts.size();i++){
            if(posts.get(i).getId().equals(id)){
                index=i;
                break;
            }
        }
        if(index!=-1){
            return  posts.get(index);
        }
        return null;
    }

    @Override
    public List<Post> list() {
        return posts;
    }
}
