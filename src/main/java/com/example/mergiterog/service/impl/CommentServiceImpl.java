package com.example.mergiterog.service.impl;

import com.example.mergiterog.payload.CommentDto;
import com.example.mergiterog.repository.CommentRepository;
import com.example.mergiterog.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentDto createComment(long postid, CommentDto commentDto) {
        return null;
    }

}
