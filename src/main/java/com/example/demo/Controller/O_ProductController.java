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
import com.example.demo.Model.O_Product;
import com.example.demo.Repository.O_ProductRepository;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class O_ProductController {

	@Autowired
	private O_ProductRepository o_ProductRepository;
	
		//all Products
		@GetMapping("/products")
		public List<O_Product> getAllSuppliers(){
			return o_ProductRepository.findAll();
		}
		
		//create product
		@PostMapping("/products")
		public O_Product createProduct(@RequestBody O_Product product) {
			return o_ProductRepository.save(product);
		}
		
		//get employee by id
		@GetMapping("/products/{id}")
		public ResponseEntity<O_Product> getProductById(@PathVariable Long pid) {
			O_Product product = o_ProductRepository.findById(pid).orElseThrow(() -> new ResourceNotFoundException("Product is not existed with this ID : "+pid));
			
			return ResponseEntity.ok(product);
		}
		
		//Update supplier
		@PutMapping("/products/{id}")
		public ResponseEntity<O_Product> updateProduct(@PathVariable Long pid,@RequestBody O_Product productdetails){
			O_Product product = o_ProductRepository.findById(pid).orElseThrow(() -> new ResourceNotFoundException("Product is not existed with this ID : "+pid));
			
			product.setProduct(productdetails.getProduct());
			product.setMaterialType(productdetails.getMaterialType());
			product.setSize(productdetails.getSize());
			product.setColor(productdetails.getColor());
			product.setFeatures(productdetails.getFeatures());
			product.setType(productdetails.getType());
			product.setQuantity(productdetails.getQuantity());
			
			O_Product updateproduct = o_ProductRepository.save(product);
			return ResponseEntity.ok(updateproduct);
		}
}
