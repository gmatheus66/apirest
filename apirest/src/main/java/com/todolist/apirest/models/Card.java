package com.todolist.apirest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name="CARD")
public class Card {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int id;
	
	private String title;
	
	@NotBlank
	private String description;
	
	@NotBlank
	private boolean notification;
	
	@NotBlank
	private Date date_add;
	
	@NotBlank
	private Date date_deadline;
	
	@NotBlank
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date date_modify;
	
	@ManyToOne
	@JoinColumn
	@NotBlank
	private User user;
	

	public User getUser() {
		return user;
	}

	public void setUser_id(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isNotification() {
		return notification;
	}

	public void setNotification(boolean notification) {
		this.notification = notification;
	}

	public Date getDate_add() {
		return date_add;
	}

	public void setDate_add(Date date_add) {
		this.date_add = date_add;
	}

	public Date getDate_deadline() {
		return date_deadline;
	}

	public void setDate_deadline(Date date_deadline) {
		this.date_deadline = date_deadline;
	}
	
	

}
