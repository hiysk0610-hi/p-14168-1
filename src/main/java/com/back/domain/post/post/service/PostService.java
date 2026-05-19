package com.back.domain.post.post.service;

import com.back.domain.post.post.entity.Post;
import com.back.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public long count() { //lnog으로 바꿔야한다. JPA가 주는게 기본적으로 long타입
        return postRepository.count();
    }

    public Post write(String title, String content) {
        Post post = new Post(title, content);

        return postRepository.save(post);
    }

    public Optional<Post> findById(int id) {
        return postRepository.findById(id);
    }
    public List<Post> findAll() {
        return postRepository.findAll();
    }
    public void modify(Post post, String title, String content) {
        post.modify(title, content);
    }

    public void delete(int id) {
        postRepository.deleteById(id);

    }
}