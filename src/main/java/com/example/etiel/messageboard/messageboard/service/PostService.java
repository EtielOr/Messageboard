package com.example.etiel.messageboard.messageboard.service;

import com.example.etiel.messageboard.messageboard.dao.PostDao;
import com.example.etiel.messageboard.messageboard.model.Post;
import com.example.etiel.messageboard.messageboard.model.PostPreview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostDao postDao;

    @Autowired
    public PostService(PostDao postDao) {
        this.postDao = postDao;
    }


    public void addPost(Post newPost) {
        postDao.save(newPost);
    }

    public Optional<Post> getPost(Long id) {
        return postDao.findById(id);
    }

    public List<PostPreview> getAllPost()
    {
        return postDao.findAllPostPreview();
    }

    public void updatePost(Long id, String title, String message) {
        Post postToUpdate = postDao.getOne(id);
        postToUpdate.setTitle(title);
        postToUpdate.setMessage(message);
        postDao.save(postToUpdate);
    }

    public void deletePost(Long id) {
        postDao.deleteById(id);
    }






}
