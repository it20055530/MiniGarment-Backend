package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.O_Supplier;
import com.example.demo.Repository.O_SupplierRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class O_SupplierController {
	
	@Autowired
	private O_SupplierRepository o_SupplierRepository;

	//all suppliers
	@GetMapping("/suppliers")
	public List<O_Supplier> getAllSuppliers(){
		return o_SupplierRepository.findAll();
	}
	
	//create supplier
	@PostMapping("/suppliers")
	public O_Supplier createSupplier(@RequestBody O_Supplier supplier) {
		return o_SupplierRepository.save(supplier);
	}
	
	//get employee by id
	@GetMapping("/suppliers/{id}")
	public ResponseEntity<O_Supplier> getSupplierById(@PathVariable Long id) {
		O_Supplier supplier = o_SupplierRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Supplier not existed with this ID : "+id));
		
		return ResponseEntity.ok(supplier);
	}
	
	//Update supplier
	@PutMapping("/suppliers/{id}")
	public ResponseEntity<O_Supplier> updateSupplier(@PathVariable Long id,@RequestBody O_Supplier supplierdetails){
		 
		O_Supplier supplier = o_SupplierRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Supplier not existed with this ID : "+id));
		
		supplier.setSname(supplierdetails.getSname());
		supplier.setSnic(supplierdetails.getSnic());
		supplier.setStype(supplierdetails.getStype());
		supplier.setScompany(supplierdetails.getScompany());
		supplier.setSemail(supplierdetails.getSemail());
		supplier.setSphone(supplierdetails.getSphone());
		supplier.setScapacity(supplierdetails.getScapacity());
		
		O_Supplier updatesupplier = o_SupplierRepository.save(supplier);
		return ResponseEntity.ok(updatesupplier);
		
	}
}
