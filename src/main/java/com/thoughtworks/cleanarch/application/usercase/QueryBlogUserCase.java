package com.thoughtworks.cleanarch.application.usercase;

import com.thoughtworks.cleanarch.domain.contexts.edit.Blog;
import com.thoughtworks.cleanarch.domain.contexts.edit.BlogNotFoundException;
import com.thoughtworks.cleanarch.domain.contexts.edit.BlogRepository;
import com.thoughtworks.cleanarch.domain.contexts.edit.BlogService;
import org.springframework.stereotype.Component;

@Component
public class QueryBlogUserCase {
    private final BlogService blogService;

    public QueryBlogUserCase(BlogRepository blogRepository) {
        this.blogService = new BlogService(blogRepository);
    }

    public Blog findBlogById(String id) throws BlogNotFoundException {
        return blogService.getBlog(id);
    }

}
