package com.shein.beshop.service;

import com.shein.beshop.entity.Bucket;
import com.shein.beshop.entity.Product;
import com.shein.beshop.entity.User;
import com.shein.beshop.repository.BucketRepo;
import com.shein.beshop.repository.ProductRepo;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BucketServiceImpl implements BucketService {
    private final BucketRepo bucketRepo;
    private final ProductRepo productRepo;

    public BucketServiceImpl(BucketRepo bucketRepo, ProductRepo productRepo) {
        this.bucketRepo = bucketRepo;
        this.productRepo = productRepo;
    }

    @Override
    @Transactional
    public Bucket createBucket(User user, List<Long>productIds){
        Bucket bucket = new Bucket();
        bucket.setUser(user);
        List<Product>productList = getCollectRefProductIds(productIds);
        bucket.setProducts(productList);
        return bucketRepo.save(bucket);
    }



    private List<Product> getCollectRefProductIds(List<Long> productIds) {
        productIds.stream()
                //getOne вытаскивает ссылку на продукт
                .map(productRepo::getOne)
                .collect(Collectors.toList());
        return null;
    }
    @Override
    public void addProducts(Bucket bucket, List<Long> productsIds) {
        List<Product>products = bucket.getProducts();
        List<Product>newProductList = products != null ? new ArrayList<>() : new ArrayList<>(products);
        newProductList.add(getCollectRefProductIds(productsIds));
        bucket.setProducts(newProductList);
        bucketRepo.save(bucket);
    }


}
