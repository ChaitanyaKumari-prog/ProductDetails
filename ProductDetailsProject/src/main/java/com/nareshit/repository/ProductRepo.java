package com.nareshit.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.nareshit.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer>{

}
