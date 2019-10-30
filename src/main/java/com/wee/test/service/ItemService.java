package com.wee.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wee.test.entity.Shop;
import com.wee.test.repository.ShopRepository;

@Service
public class ItemService {

    @Autowired
    private ShopRepository repository;

    public String report(String shopId) {
        return "{}";
    }
    
    public List<Shop> all() {
    	return repository.findAll();
    }
    
}
