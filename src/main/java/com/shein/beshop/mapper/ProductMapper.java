package com.shein.beshop.mapper;

import com.shein.beshop.dto.ProductDto;
import com.shein.beshop.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);
    Product toProduct(ProductDto productDto);

    @InheritInverseConfiguration
    ProductDto fromProduct(Product product);
    List<Product> toProductList(List<ProductDto>productDTOS);
    List<ProductDto> fromProductList(List<Product>products);
}
