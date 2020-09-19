package com.thoughtworks.cleanarch.domain.contexts.publish;

import com.thoughtworks.cleanarch.domain.contexts.edit.Blog;
import com.thoughtworks.cleanarch.domain.core.concepts.DomainService;

import java.util.Date;
import java.util.List;

public class PublishedService implements DomainService {

    public PublishedBlog publishBlog(String id,String title,String content) {

        Date publishTime = new Date();
        PublishedBlog publishedBlog = new PublishedBlog(id,title, content,publishTime);

        return publishedBlog;
    }



    public List<Comment> viewComments(String id){

        return null;
    }
}
