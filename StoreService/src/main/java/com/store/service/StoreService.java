package com.store.service;

import java.util.List;

import com.store.entity.Store;

public interface StoreService {
	
	Store add(Store store);
	
	List<Store> get();
	
	Store get(Long id);
	
}
