package com.joaotinelli.joaostore.service;

import com.joaotinelli.joaostore.dto.ProductDto;

import java.util.List;

public interface IProductService {

    List<ProductDto> getProducts();
}