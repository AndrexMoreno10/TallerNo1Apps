package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Product;



public interface IRepositoryProduct extends JpaRepository<Product,Long>{

}

