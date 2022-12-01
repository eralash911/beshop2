package com.shein.beshop.repository;

import com.shein.beshop.entity.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepo extends JpaRepository<Bucket, Long> {
}
