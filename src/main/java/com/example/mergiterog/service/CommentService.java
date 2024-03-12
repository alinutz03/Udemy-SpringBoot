package com.example.mergiterog.service;

import com.example.mergiterog.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postid, CommentDto commentDto);
    List<CommentDto> getCommentsByPostId(long postId);
    CommentDto getCommentByPostId(long postId, long commentId);
    CommentDto updateComment(Long postId, long commentId, CommentDto commentDto);
    void deleteCommentById(Long postId, long commentId);
}
