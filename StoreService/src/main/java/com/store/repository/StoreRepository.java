package com.store.repository;

import com.store.entity.Store;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StoreRepository extends JpaRepository<Store, Long> {

	
}
