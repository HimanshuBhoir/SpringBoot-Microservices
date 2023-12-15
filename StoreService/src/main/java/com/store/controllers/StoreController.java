package com.store.controllers;

import java.util.List;

import com.store.entity.Store;
import com.store.service.StoreService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {

	private StoreService storeService;

	public StoreController(StoreService storeService) {
		this.storeService = storeService;
	}
	
//	Create
	@PostMapping
	public Store create(@RequestBody Store store) {
		return storeService.add(store);
	}
	
	@GetMapping
	public List<Store> get() {
		return storeService.get();
	}
	
	@GetMapping("/{id}")
	public Store getOne(@PathVariable Long id) {
		return storeService.get(id);
	}
	
	
}
