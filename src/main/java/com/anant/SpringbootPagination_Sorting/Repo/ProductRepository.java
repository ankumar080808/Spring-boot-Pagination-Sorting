package com.anant.SpringbootPagination_Sorting.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anant.SpringbootPagination_Sorting.Entity.Product;



public interface ProductRepository extends JpaRepository<Product,Integer> {
}