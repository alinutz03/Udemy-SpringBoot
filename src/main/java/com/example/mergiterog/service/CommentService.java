package com.example.mergiterog.service;

import com.example.mergiterog.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(long postid, CommentDto commentDto);
}
