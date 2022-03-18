package com.shailendra.itemInventory.controller;

import com.shailendra.itemInventory.entity.itemInventory;
import com.shailendra.itemInventory.service.itemInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/itemInventory")
public class itemInventoryController {

    private itemInventoryService itemInventoryService;

    @Autowired
    public itemInventoryController(itemInventoryService itemInventoryService) {
        this.itemInventoryService = itemInventoryService;
    }

    @GetMapping("/{itemId}")
    public Optional<itemInventory> getInventoryRecord(@PathVariable int itemId){
        return itemInventoryService.getInventory(itemId);
    }
}
