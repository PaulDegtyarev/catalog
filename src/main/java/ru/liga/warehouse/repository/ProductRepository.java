package ru.liga.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.liga.warehouse.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Integer, Product> {

    boolean existsByNameIgnoreCaseAndQuantityGreaterThanEqual(String name, Integer quantity);
}