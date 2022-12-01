package com.shein.beshop.service;

import com.shein.beshop.dto.ProductDto;
import com.shein.beshop.mapper.ProductMapper;
import com.shein.beshop.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper mapper = ProductMapper.MAPPER;
    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<ProductDto>getAll(){
        return mapper.fromProductList(productRepo.findAll());
    }
}
