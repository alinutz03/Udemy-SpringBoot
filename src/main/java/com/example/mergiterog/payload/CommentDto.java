package com.example.mergiterog.payload;

import com.example.mergiterog.entity.Post;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class CommentDto {
    private long id;
    private String name;
    private String email;
    private String body;
}
