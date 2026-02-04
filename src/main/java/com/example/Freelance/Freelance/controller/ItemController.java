package com.example.Freelance.Freelance.controller;

import com.example.Freelance.Freelance.dto.ItemRequestDTO;
import com.example.Freelance.Freelance.dto.ItemResponseDTO;
import com.example.Freelance.Freelance.model.Item;
import com.example.Freelance.Freelance.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller responsible for handling HTTP requests related to items.
 * Acts as an entry point to the application.
 */

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    /**
     * Constructor-based dependency injection.
     */
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    /**
     * API endpoint to add a new item.
     * Validation is triggered before entering the service layer.
     *
     * @param request incoming item data
     * @return created item response
     */
    @PostMapping
    public ResponseEntity<ItemResponseDTO> addItem(@Valid @RequestBody ItemRequestDTO request){
        Item item = itemService.addItem(request);

        return ResponseEntity.ok(new ItemResponseDTO(item.getId(),item.getName(), item.getDescription()));
    }

    /**
     * API endpoint to fetch an item by ID.
     *
     * @param id item identifier
     * @return item data if found, otherwise 404
     */
    @GetMapping("/{id}")
    public ResponseEntity<ItemResponseDTO> getItem(@PathVariable Long id){
        return itemService.getItemById(id).map(item->ResponseEntity.ok(new ItemResponseDTO(
                item.getId(),
                item.getName(),
                item.getDescription()
        )
                )).orElse(ResponseEntity.notFound().build());
    }
}
