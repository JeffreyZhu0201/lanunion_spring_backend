package com.jeffrey.lanunion_spring_backend.service;

import com.jeffrey.lanunion_spring_backend.common.Result;
import com.jeffrey.lanunion_spring_backend.entity.Post;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

    Result addPost(Post post);

    Result deletePost(Integer id);

    Result updatePost(Post post);

    Result getPostById(Integer id);

}
