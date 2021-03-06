package ru.skillbox.blogengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillbox.blogengine.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
