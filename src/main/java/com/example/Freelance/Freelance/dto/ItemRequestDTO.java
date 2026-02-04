package com.example.Freelance.Freelance.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * DTO used for incoming API requests while creating a new item.
 * Validation is applied here to ensure only valid data enters the system.
 */

@Data
public class ItemRequestDTO {

    /**
     * Name is mandatory and must not be empty.
     */
    @NotBlank(message = "Name is required")
    private String name;

    /**
     * Description is mandatory and must not be empty.
     */
    @NotBlank(message = "Description is required")
    private String description;
}
