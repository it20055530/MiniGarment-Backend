package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.O_Product;

@Repository
public interface O_ProductRepository extends JpaRepository<O_Product, Long>{

}
