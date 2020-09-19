package com.thoughtworks.cleanarch.domain.contexts.edit;

import com.thoughtworks.cleanarch.domain.core.concepts.AggregateRoot;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
public class Blog implements AggregateRoot {
    private String id;
    private String title;
    private String content;
    private List<HistoryBlog> historyBlogList;

    public Blog(String title, String content) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.content = content;
    }

    public void saveDraft(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public List<HistoryBlog> getHistoryBlogList() {
        return historyBlogList;
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
