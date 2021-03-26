package ru.skillbox.blogengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillbox.blogengine.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
