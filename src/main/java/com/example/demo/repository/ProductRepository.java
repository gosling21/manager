package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductRepository {

    List<Product> findAll();
}
