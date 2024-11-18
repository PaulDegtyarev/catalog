package ru.liga.warehouse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "products", schema = "public")
public class Product {
    @Id
    @Column(name = "product_id")
    private final Integer productId;

    @Column(name = "name")
    private final String name;
}
