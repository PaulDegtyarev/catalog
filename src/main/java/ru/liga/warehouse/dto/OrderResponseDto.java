package ru.liga.warehouse.dto;

import lombok.Data;


@Data
public class OrderResponseDto {
    private final Integer productId;
    private final String name;
}
