package ru.skillbox.blogengine.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skillbox.blogengine.repository.PostRepository;

@RestController
@RequestMapping("/api/post/")
@RequiredArgsConstructor
public class ApiPostController {
    private final PostRepository postRepository;

    @GetMapping
    public ResponseEntity<?> getPosts() {
        return ResponseEntity.ok().body(postRepository.findAll());
    }
}
