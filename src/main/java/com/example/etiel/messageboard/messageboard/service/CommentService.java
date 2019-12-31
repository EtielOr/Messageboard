package com.example.etiel.messageboard.messageboard.service;


import com.example.etiel.messageboard.messageboard.dao.CommentDao;
import com.example.etiel.messageboard.messageboard.dao.PostDao;
import com.example.etiel.messageboard.messageboard.model.Comment;
import com.example.etiel.messageboard.messageboard.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    private final CommentDao commentDao;
    private final PostDao postDao;

    @Autowired
    public CommentService(CommentDao commentDao, PostDao postDao) {
        this.commentDao = commentDao;
        this.postDao = postDao;
    }

    public void addComment(Long postId,Comment comment) {
        Optional<Post> post = postDao.findById(postId);
        if(post.isPresent()) {
            comment.setPost(post.get());
            commentDao.save(comment);
        }
    }

    public List<Comment> findCommentsByPostId(Long postId) {
        return commentDao.findByPostId(postId);
    }

    public void updateComment(Comment updateComment) {
        //Comment commentToUpdate = commentDao.getOne(id);
       // commentToUpdate.setMessage(message);
       // commentDao.save(commentToUpdate);
    }

    public void deleteComment(Long id) {
        commentDao.deleteById(id);
    }
}
