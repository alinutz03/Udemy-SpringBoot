package com.example.mergiterog.service;

import com.example.mergiterog.payload.PostDto;
import com.example.mergiterog.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNumber, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePostById(long id);

}
