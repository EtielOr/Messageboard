package com.example.etiel.messageboard.messageboard.dao;

import com.example.etiel.messageboard.messageboard.model.Post;
import com.example.etiel.messageboard.messageboard.model.PostPreview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface PostDao extends JpaRepository<Post,Long> {

    //@Modifying
    //@Transactional
    //@Query("UPDATE Post p SET p.title = :title, p.message = :message where p.id = :post_id")
    //void updatePost(@Param("post_id") Long id, @Param("title")String title, @Param("message") String message );

    @Query("SELECT p.id as id, p.title as title, p.createdDate as createdDate FROM Post p")
    List<PostPreview> findAllPostPreview();
}


