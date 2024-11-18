package ru.liga.warehouse.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.liga.warehouse.repository.ProductRepository;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<Boolean> existsByName(
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "quantity", required = false) Integer quantity
    ) {
        return new ResponseEntity<>(
                productRepository.existsByNameIgnoreCaseAndQuantityGreaterThanEqual(
                        name,
                        quantity
                ),
                HttpStatus.OK);
    }
}