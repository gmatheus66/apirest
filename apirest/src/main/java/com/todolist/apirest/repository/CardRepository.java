package com.todolist.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.apirest.models.Card;


public interface CardRepository  extends JpaRepository<Card,Integer>{

	Card findById(int id);
	
}
