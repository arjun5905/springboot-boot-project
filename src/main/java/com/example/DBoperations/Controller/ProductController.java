package com.example.DBoperations.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DBoperations.Entity.Product;
import com.example.DBoperations.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveproduct")
	public Product addProdut(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@PostMapping("/saveAllproducts")
	public List<Product> addProducts(@RequestBody List<Product> products){
		return productService.saveAll(products);
	}
	
	@GetMapping(value = "/productby/{id}")
	public Product getById(@PathVariable Integer id) {
		return productService.findByID(id);
	}
	
	@DeleteMapping("/delete/")
	public String delete(@RequestParam Integer id) {
		return productService.delete(id);
	}
	
	@PutMapping("/update")
	public Product update(@RequestBody Product product) {
		return productService.update(product);
		
	}
	
	@GetMapping(value= "/product/{name}")
	public List<Product> getbyName(@PathVariable String name) {
		return productService.getByName(name);
		
	}
	
	@GetMapping(value = "/allProductDetails")
	public List<Product> getAllDetails(){
		return productService.getAllproducts();
	}
	
	@GetMapping(value= "/brand/{name}")
	public List<Product> getByBrand(@PathVariable String name) {
		return productService.getByBrand(name);
		
	}
	
}
