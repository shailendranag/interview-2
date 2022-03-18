package com.shailendra.itemInventory.repository;

import com.shailendra.itemInventory.entity.itemInventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemInventoryRepository extends CrudRepository<itemInventory,Integer> {
}
