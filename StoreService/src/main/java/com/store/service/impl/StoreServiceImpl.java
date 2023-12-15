package com.store.service.impl;

import java.util.List;

import com.store.entity.Store;
import com.store.repository.StoreRepository;
import com.store.service.StoreService;

import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

	private StoreRepository storeRepository;
	
	public StoreServiceImpl(StoreRepository storeRepository) {
		super();
		this.storeRepository = storeRepository;
	}

	@Override
	public Store add(Store store) {
		storeRepository.save(store);
		return store;
	}

	@Override
	public List<Store> get() {
		return storeRepository.findAll();
	}

	@Override
	public Store get(Long id) {
		// TODO Auto-generated method stub
		return storeRepository.findById(id).orElseThrow(()-> new RuntimeException("Store not found"));
	}

}
