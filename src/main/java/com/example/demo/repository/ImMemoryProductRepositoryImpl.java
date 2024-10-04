package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.IntStream;

@Repository
public class ImMemoryProductRepositoryImpl implements ProductRepository {
    private final List<Product> products = Collections.synchronizedList(new LinkedList<>());

    public ImMemoryProductRepositoryImpl() {
        IntStream.range(1, 4)
                .forEach(i -> this.products.add(new Product(i, "Товар N%d".formatted(i),
                        "Описание товара N%d".formatted(i))));
    }

    @Override
    public List<Product> findAll() {
        return Collections.unmodifiableList(this.products);
    }
}
