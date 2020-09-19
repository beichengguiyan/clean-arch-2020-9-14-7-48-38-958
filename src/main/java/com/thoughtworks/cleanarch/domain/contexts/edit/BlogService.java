package com.thoughtworks.cleanarch.domain.contexts.edit;

public class BlogService {
    private BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public Blog createBlog(String title, String content) {

        Blog blog = new Blog(title, content);
        blogRepository.saveBlog(blog);
        return blog;
    }

    public void deleteBlog(String id) {

        blogRepository.deletBlog(id);
    }

    public Blog editBlog(String id, String title, String content) throws BlogNotFoundException {

        Blog blog = blogRepository.getBlog(id).orElseThrow(() -> new BlogNotFoundException());
        blog.saveDraft(title, content);
        blogRepository.saveBlog(blog);
        return blog;
    }

    public Blog getBlog(String id) throws BlogNotFoundException {

        Blog blog = blogRepository.getBlog(id).orElseThrow(() -> new BlogNotFoundException());
        return blog;
    }


}
