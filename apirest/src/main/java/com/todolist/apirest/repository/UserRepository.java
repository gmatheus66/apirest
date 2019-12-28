package com.todolist.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.todolist.apirest.models.User;

public interface UserRepository extends JpaRepository<User,Integer>{



}