package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// базовое описание сущности
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    private Integer id;

    private String title;

    private String details;
}
