package com.vega.springgit.repository;

import com.vega.springgit.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;





public interface CommentRepository extends JpaRepository<Comment,Long> {


}