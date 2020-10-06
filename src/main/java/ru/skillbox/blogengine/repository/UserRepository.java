package ru.skillbox.blogengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skillbox.blogengine.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
