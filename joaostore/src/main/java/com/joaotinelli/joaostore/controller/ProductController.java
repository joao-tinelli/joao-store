package com.joaotinelli.joaostore.controller;

import com.joaotinelli.joaostore.dto.ProductDto;
import com.joaotinelli.joaostore.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final IProductService iProductService;

    @GetMapping
    public List<ProductDto> getProducts() { // DTO Pattern
        List<ProductDto> productList = iProductService.getProducts();
        return productList;
    }

}