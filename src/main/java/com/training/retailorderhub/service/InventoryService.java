package com.training.retailorderhub.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import com.training.retailorderhub.repository.InventoryRepository;

@Service
public class InventoryService {
    @PersistenceContext
    private EntityManager entityManager;
    private InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public boolean isInStock(String itemName) {
        return inventoryRepository.getInventoryQuantity(itemName) > 0;
    }

    public void decrementQuantity(String itemName) {
        inventoryRepository.decrementQuantity(itemName);
    }
}
