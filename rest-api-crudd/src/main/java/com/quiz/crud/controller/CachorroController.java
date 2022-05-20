package com.quiz.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.crud.model.Cachorro;
import com.quiz.crud.repository.CachorroRepository;

@RestController
public class CachorroController {
	
	@Autowired
	private CachorroRepository repository;
	
	@GetMapping("/cachorro")
	public List<Cachorro> getAllCachorros(){
		return repository.findAll();
	}
	
	@GetMapping("/cachorro/{id}")
	public Cachorro getCachorroById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/cachorro")
	public Cachorro saveCachorro(@RequestBody Cachorro cachorro) {
		return repository.save(cachorro);
	}
	
	@DeleteMapping("cachorro/{id}")
	public void deleteCachorro(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
