package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository//signals that this interface object is database related crud operations object

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
