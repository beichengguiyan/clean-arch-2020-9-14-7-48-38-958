package com.thoughtworks.cleanarch.domain.contexts.publish;

import com.thoughtworks.cleanarch.domain.contexts.edit.HistoryBlog;
import com.thoughtworks.cleanarch.domain.core.concepts.AggregateRoot;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
public class PublishedBlog implements AggregateRoot {

        private String id;
        private String title;
        private String content;
        private Date publishTime;
        private List<Comment> commentList;

    public PublishedBlog(String id,String title, String content,Date publishTime) {
        this.id = id;
        this.title = title;
        this.content =content;
        this.publishTime = publishTime;
    }


}
