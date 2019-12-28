package com.todolist.apirest.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.todolist.apirest.models.Card;

@Entity
@Table(name="USER")
public class User {
	private User user;
	@NotBlank
	private String name;
	
	private int token;
	
	@NotBlank
	private  String email;
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;


	public String getName() {
		return name;
	}

	@OneToMany(targetEntity = Card.class, mappedBy ="User", fetch = FetchType.LAZY)
	public User getUser(){
		return user;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
