package com.example.lesson2crud.model;


import com.example.lesson2crud.entity.Post;

public class PostListItem {
    private Long id;
    private String title;
    private Long date;

    public static PostListItem fromPost(Post post) {
        PostListItem postListItem=new PostListItem();
        postListItem.setId(post.getId());
        postListItem.setTitle(post.getTitle());
        postListItem.setDate(post.getCreatedDate().getTime());
        return postListItem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}
