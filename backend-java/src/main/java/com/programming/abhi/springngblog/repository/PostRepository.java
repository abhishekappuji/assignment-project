package com.programming.abhi.springngblog.repository;

import com.programming.abhi.springngblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
