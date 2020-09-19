package com.thoughtworks.cleanarch.application.usercase;

import com.thoughtworks.cleanarch.application.concepts.UserCase;
import com.thoughtworks.cleanarch.domain.contexts.edit.Blog;
import com.thoughtworks.cleanarch.domain.contexts.edit.BlogRepository;
import com.thoughtworks.cleanarch.domain.contexts.edit.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EditBlogUserCase implements UserCase {
    private final BlogService blogService;

    public EditBlogUserCase(BlogRepository blogRepository) {
        this.blogService = new BlogService(blogRepository);
    }

    public Blog createBlog(String title, String content) {
        return blogService.createBlog(title, content);
    }
}
