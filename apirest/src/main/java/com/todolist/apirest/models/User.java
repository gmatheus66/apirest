package com.todolist.apirest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="USER")
public class User {
	
	@NotBlank
	private String name;
	
	private int token;
	
	@NotBlank
	private  String email;
	
	@Id
	@NotBlank
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;


	public String getName() {
		return name;
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
