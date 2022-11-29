package com.shein.beshop.service;

import com.shein.beshop.entity.Bucket;
import com.shein.beshop.entity.User;

import java.util.List;

public interface BucketService {

    Bucket createBucket(User user, List<Long> productIds);
    void addProducts(Bucket bucket, List<Long> productsIds);
}
