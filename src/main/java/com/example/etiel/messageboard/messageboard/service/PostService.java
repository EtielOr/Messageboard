package com.example.etiel.messageboard.messageboard.service;

import com.example.etiel.messageboard.messageboard.dao.PostDao;
import com.example.etiel.messageboard.messageboard.model.Post;
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

    public int addPost(String title, String message)
    {

        if( title.isBlank() || message.isBlank() ) {
            System.out.println("bad message");
            return -1;
        }

        Post newMessage = new Post();
        newMessage.setTitle(title);
        newMessage.setMessage(message);

        postDao.save(newMessage);

        return 1;
    }

    public int updatePost(Long id, String title, String message) {

        if( title.isBlank() || message.isBlank() ) {
            System.out.println("bad message");
            return -1;
        }

        postDao.updatePost(id,title,message);
        return 1;

    }

    public int deletePost(Long id) {
        postDao.deleteById(id);
        return 1;
    }

    public Optional<Post> getPost(Long id) {
        return postDao.findById(id);
    }

    public List<Post> getAllPost()
    {
        return postDao.findAll();
    }
}
