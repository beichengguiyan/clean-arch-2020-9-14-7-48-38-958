package com.thoughtworks.cleanarch.adapter.inbound.rest.blog;

import lombok.Getter;


public class BlogRequest {
    private String id;
    private String title;
    private String content;

    public BlogRequest(String id, String title, String content) {
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
}
