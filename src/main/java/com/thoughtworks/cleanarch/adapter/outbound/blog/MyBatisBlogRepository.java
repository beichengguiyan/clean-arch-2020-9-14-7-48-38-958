package com.thoughtworks.cleanarch.adapter.outbound.blog;

import com.thoughtworks.cleanarch.domain.contexts.edit.Blog;
import com.thoughtworks.cleanarch.domain.contexts.edit.BlogRepository;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyBatisBlogRepository implements BlogRepository {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public void saveBlog(Blog blog) {
        blogMapper.insert(blog);
    }

    @Override
    public Optional<Blog> getBlog(String id) {
        return Optional.empty();
    }

    @Override
    public void deletBlog(String id) {

    }
}
