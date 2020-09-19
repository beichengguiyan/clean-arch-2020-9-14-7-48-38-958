package com.thoughtworks.cleanarch.adapter.inbound.rest.blog;

import com.thoughtworks.cleanarch.domain.contexts.edit.Blog;

public class BlogResponse {

    private String id;
    private String title;
    private String content;

    public BlogResponse(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public static BlogResponse of(Blog blog) {
        return new BlogResponse(blog.getId(),blog.getTitle(),blog.getContent());
    }
}
