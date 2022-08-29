package com.example.lesson2crud.model;


import com.sun.istack.NotNull;
import net.bytebuddy.implementation.bind.annotation.Empty;
import org.springframework.lang.NonNull;

public class PostForm {

    private String title;

    private String content;

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
}
