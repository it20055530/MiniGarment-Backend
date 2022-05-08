package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.O_Supplier;

@Repository
public interface O_SupplierRepository extends JpaRepository<O_Supplier, Long>{

}
