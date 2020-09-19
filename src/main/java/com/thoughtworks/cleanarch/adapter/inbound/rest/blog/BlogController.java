package com.thoughtworks.cleanarch.adapter.inbound.rest.blog;


import com.thoughtworks.cleanarch.application.usercase.EditBlogUserCase;
import com.thoughtworks.cleanarch.application.usercase.QueryBlogUserCase;
import com.thoughtworks.cleanarch.domain.contexts.edit.Blog;
import com.thoughtworks.cleanarch.domain.contexts.edit.BlogNotFoundException;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {

    private QueryBlogUserCase queryBlogUserCase;
    private EditBlogUserCase editBlogUserCase;

    public BlogController(QueryBlogUserCase queryBlogUserCase, EditBlogUserCase editBlogUserCase) {
        this.queryBlogUserCase = queryBlogUserCase;
        this.editBlogUserCase = editBlogUserCase;
    }

    @GetMapping("/{id}")
    public  BlogResponse get(@PathVariable String id) throws BlogNotFoundException {
        Blog blog =queryBlogUserCase.findBlogById(id);
        return BlogResponse.of(blog);
    }

    @PostMapping
    public  BlogResponse get(@RequestBody BlogRequest blogRequest) throws BlogNotFoundException {
        Blog blog =editBlogUserCase.createBlog(blogRequest.getTitle(),blogRequest.getContent());
        return BlogResponse.of(blog);
    }

}
