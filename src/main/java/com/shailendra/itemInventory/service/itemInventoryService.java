package com.shailendra.itemInventory.service;

import com.shailendra.itemInventory.entity.itemInventory;
import com.shailendra.itemInventory.repository.itemInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class itemInventoryService {

    private itemInventoryRepository inventoryRepository;

    @Autowired
    public itemInventoryService(itemInventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public itemInventory getInventory(int itemId){
       return inventoryRepository.findById(itemId).orElseThrow();
    }
}
