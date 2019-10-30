package com.wee.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wee.test.entity.Shop;

public interface ShopRepository extends JpaRepository<Shop, String> {
		
		
}
