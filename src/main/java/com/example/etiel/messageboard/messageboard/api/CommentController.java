package com.example.etiel.messageboard.messageboard.api;


import com.example.etiel.messageboard.messageboard.model.Comment;
import com.example.etiel.messageboard.messageboard.model.Post;
import com.example.etiel.messageboard.messageboard.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/api")
@RestController
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/post/{postId}")
    public void newComment(@PathVariable Long postId,@RequestBody Comment newComment)
    {
        commentService.addComment(postId,newComment);
    }

    @GetMapping("/post/{postId}/comment")
    List<Comment> getComments(@PathVariable Long postId) {
        return  commentService.findCommentsByPostId(postId);
    }

    @PutMapping("/post/{postId}")
    void updateComments(@RequestBody Comment updateComment) {
        commentService.updateComment(updateComment);
    }

    @DeleteMapping("/post/{postId}/comment/{commentId}")
    void deleteComment(@PathVariable Long postId, @PathVariable Long commentId) {
        commentService.deleteComment(commentId);
    }

}
