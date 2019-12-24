package com.example.etiel.messageboard.messageboard.api;

import com.example.etiel.messageboard.messageboard.model.Post;
import com.example.etiel.messageboard.messageboard.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/Post")
    public List<Post> test()
    {

        postService.addPost("title " , "message ");
        return  postService.getAllPost();
    }

    @GetMapping("/UpdateTest")
    public String aa()
    {
        postService.updatePost(1L,"aaaaaaaa","aaaaaaaaaaaaaa");
        return "fff";
    }

    @GetMapping
    String hello()
    {
        return "Hello";
    }
}
