package com.jeffrey.lanunion_spring_backend.mapper;


import com.jeffrey.lanunion_spring_backend.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PostMapper {

    Boolean addPost(@Param("post") Post post);

    Boolean deletePost(Integer id);

    Boolean updatePost(@Param("post") Post post);

    Post getPostById(Integer id);

}
