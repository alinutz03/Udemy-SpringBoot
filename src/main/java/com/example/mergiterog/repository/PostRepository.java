package com.example.mergiterog.repository;

import com.example.mergiterog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}


// Apias throw a ResourceNotFoundException daca un id nu e in baza de date