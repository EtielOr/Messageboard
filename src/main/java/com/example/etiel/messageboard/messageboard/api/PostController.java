package com.example.etiel.messageboard.messageboard.api;

import com.example.etiel.messageboard.messageboard.model.Post;
import com.example.etiel.messageboard.messageboard.model.PostPreview;
import com.example.etiel.messageboard.messageboard.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RequestMapping("/api/post")
@RestController
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }


    @PostMapping
    public void newPost(@RequestBody Post newPost)
    {
        postService.addPost(newPost);
    }

    @GetMapping
    public List<PostPreview> getPostList()
    {
        return  postService.getAllPost();
    }

    @GetMapping("/{id}")
    public Optional<Post> getPost(@PathVariable Long id) {
        return postService.getPost(id);
    }

    @PutMapping
    public void updatePost(@RequestParam("id") Long id, @RequestParam("title") String title,
                             @RequestParam("message") String message)
    {
        postService.updatePost(id,title,message);;
    }

    @DeleteMapping
    public  void deletePost(@RequestParam("id") Long id) {
        postService.deletePost(id);
    }

}
