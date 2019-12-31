package com.example.etiel.messageboard.messageboard.dao;

import com.example.etiel.messageboard.messageboard.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface CommentDao extends JpaRepository<Comment,Long> {


    List<Comment> findByPostId(Long postId);

    //@Modifying
    //@Transactional
    //@Query("UPDATE Comment as c SET c.message = :message where  c.id = :id")
    //void updateComment(Long id, String message);

}
