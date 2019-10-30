package com.wee.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wee.test.dto.ReportDto;
import com.wee.test.entity.Item;
import com.wee.test.entity.Shop;
import com.wee.test.repository.ItemRepository;
import com.wee.test.repository.ShopRepository;

@Service
public class ShopService {

	@Autowired
	private ShopRepository shopRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	public ReportDto report(String shopId) {
		var shop = shopRepository.findById(shopId).get();
		
		return new ReportDto(shop.getId(),shop.getName(),shop.getItems().size());
	}

	public List<Shop> getAllShop(String id) {
		if (id == null) {
			return shopRepository.findAll();
		}

		var shop = shopRepository.findById(id).get();

		return List.of(shop);
	}

	@Transactional
	public Shop updateCreate(String id, Shop shop) {
		shop = shopRepository.save(shop);
        for (Item item : shop.getItems()) {
        	item.setShop(shop);
        	itemRepository.save(item);
		}
		var persisted = shopRepository.findById(shop.getId()).get();
		persisted.setName(shop.getName());
		return shop;
	}

    @Transactional
    public String delete(String id) {
        var shop = shopRepository.findById(id)
            .get();
        shopRepository.delete(shop);
        
        return "Sucesso";
    }
	
}
