package com.wee.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wee.test.entity.Item;

public interface ItemRepository extends JpaRepository<Item, String> {
	
//	@Query(value = "select s.shop.id, s.shop.name , count(*) countItem from Item s  where s.shop.id = ?1 group by s.shop.id, s.shop.name")
//	public Item report(String id);
			
}
