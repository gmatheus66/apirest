package com.todolist.apirest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.apirest.repository.CardRepository;
import com.todolist.apirest.models.Card;

import java.util.List;

@RestController
@RequestMapping(value = "/api/card")
public class CardResource {

	@RequestMapping("/")
    public String home(){
        return "Welcome Cards Api";
    }

	@Autowired
	private CardRepository cardrepository;
	
	@GetMapping("/cards")
	public List<Card> ListCards(){
		return cardrepository.findAll();
	}
	
	
	@GetMapping("/{id}")	
	public Card ListCard(@PathVariable(value = "id") int id) {
		return cardrepository.findById(id);
	}
	
	@PostMapping("/add")
	public Card Add(@RequestBody Card card) {
		return cardrepository.save(card);
	}
	
}
