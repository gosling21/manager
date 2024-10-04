package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
@RequestMapping("catalogue/products/list")
public class ProductsController {

    private final ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public String getProductsList(Model model) {  //обратиться к сервису -> добавить в модель -> вернуть название шаблона
        // который будет создам ввиде html страницы
        model.addAttribute("products", this.productService.findAllProducts());
        return "catalogue/products/list";
        vjhkfjkdghvkjhkhv
        //ДЛЯ ГИТА ТЕСТ
    }
}
