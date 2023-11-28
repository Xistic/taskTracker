package com.javaback.taskapi.repo;

import com.javaback.taskapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
