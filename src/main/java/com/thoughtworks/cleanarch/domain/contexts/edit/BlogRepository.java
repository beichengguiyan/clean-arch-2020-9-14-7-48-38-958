package com.thoughtworks.cleanarch.domain.contexts.edit;

import java.util.Optional;

public interface BlogRepository {
    void saveBlog(Blog blog);

    Optional<Blog> getBlog(String id);

    void deletBlog(String id);
}
