package com.example.Freelance.Freelance.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * DTO used for sending item data back to the client.
 * This ensures that internal models are not exposed directly.
 */

@Data
@AllArgsConstructor
public class ItemResponseDTO {
    private Long id;
    private String name;
    private String description;
}
