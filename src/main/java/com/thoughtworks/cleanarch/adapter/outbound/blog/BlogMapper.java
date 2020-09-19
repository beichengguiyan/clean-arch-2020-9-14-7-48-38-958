package com.thoughtworks.cleanarch.adapter.outbound.blog;

import com.thoughtworks.cleanarch.domain.contexts.edit.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    @Insert("insert into values (#{blog.id},#{blog.title},#{blog.content})")
    public void insert(@Param("blog") Blog blog) ;


}
