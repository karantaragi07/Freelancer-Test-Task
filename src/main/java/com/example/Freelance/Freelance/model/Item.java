package com.example.Freelance.Freelance.model;

/**
 * Item is a simple domain model representing an item in the system.
 * This class does not contain any validation annotations because
 * validation is handled at the API layer using DTOs.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //Rather than making code lengthy we used this lombok annotation which helps us with Generating getters, setters, equals, hashCode, and toString
@NoArgsConstructor  // Required for object creation
@AllArgsConstructor // Used for easy object creation in service layer
public class Item {
    /**
     * Unique identifier for the item.
     * Generated internally using an in-memory counter.
     */
    private Long id;
    private String name;
    private String description;
}
