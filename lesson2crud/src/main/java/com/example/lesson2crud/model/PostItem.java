package com.example.lesson2crud.model;


import com.example.lesson2crud.entity.Post;

public class PostItem {
    private Long id;
    private String title;
    private String content;
    private Long date;

    public static PostItem fromPost(Post post){
        PostItem postItem=new PostItem();
        postItem.setContent(post.getContent());
        postItem.setDate(post.getCreatedDate().getTime());
        postItem.setTitle(post.getTitle());
        postItem.setId(post.getId());
        return postItem;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}
