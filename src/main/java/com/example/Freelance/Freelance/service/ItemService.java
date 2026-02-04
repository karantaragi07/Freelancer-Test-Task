package com.example.Freelance.Freelance.service;

import com.example.Freelance.Freelance.dto.ItemRequestDTO;
import com.example.Freelance.Freelance.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Service layer contains the business logic of the application.
 * It manages items using an in-memory data structure as required.
 */
@Service
public class ItemService {

    /**
     * In-memory storage for items.
     * ArrayList is used as per the requirement.
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Counter used to generate unique IDs for items.
     * This copies the  auto-increment behavior of a database.
     */
    private Long idCounter  = 1L;

    /**
     * Creates and stores a new item.
     *
     * @param dto request data coming from the API layer
     * @return newly created Item
     */
    public Item addItem(ItemRequestDTO dto){
        Item item = new Item(
                idCounter++,  // Generate unique ID
                dto.getName(),  // Map DTO to domain model
        dto.getDescription()
        );
        items.add(item);
        return item;
    }

    /**
     * Retrieves an item by its ID.
     *
     * @param id item identifier
     * @return Optional containing item if found, otherwise empty
     */
    public Optional<Item> getItemById(Long id){
        return items.stream().filter(item->item.getId().equals(id)).findFirst();
    }

}
