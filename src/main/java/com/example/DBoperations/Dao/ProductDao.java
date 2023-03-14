package com.example.DBoperations.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.DBoperations.Entity.Product;
import com.example.DBoperations.Repo.ProductRepo;

@Component
public class ProductDao {
	
	@Autowired
	private ProductRepo productRepo;
	
	public Product save(Product product) {
		return productRepo.save(product);	
	}
	
	public List<Product> saveAll(List<Product> products) {
		return productRepo.saveAll(products);
	}
	public Product findById(Integer id) {
		return productRepo.findById(id).orElse(null);
	}
	
	public String delete(Integer id) {
		productRepo.deleteById(id);
		return "deleted record with"+ id;
	}
	
	public Product update(Product product) {
		Product existing = productRepo.findById(product.getPid()).orElse(null);
		if(existing != null)
		{
		existing.setPbrand(product.getPbrand());
		return productRepo.save(existing);
		}
		else {
		return productRepo.save(product);
			}
	}
	public  List<Product> getByName(String name){
		return productRepo.findByPname(name);
	}

	public List<Product> getAllproducts() {
		return productRepo.findAll();
	}

	public List<Product> getByBrand(String name) {
		return productRepo.findByPbrand(name);
	}
}
