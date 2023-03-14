package com.example.DBoperations.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DBoperations.Dao.ProductDao;
import com.example.DBoperations.Entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public Product save(Product product) {
		return productDao.save(product);
	}
	
	public List<Product> saveAll(List<Product> products) {
		productDao.saveAll(products);
		return products;
	}
	
	public Product findByID(Integer id) {
		return productDao.findById(id);
		
	}
		
	public String delete(Integer id) {
		 productDao.delete(id);
		 return "Deleted record of: "+id;
	}
	
	public Product update(Product product) {
		return productDao.update(product);
		
	}
	
	public  List<Product> getByName(String name) {
		return productDao.getByName(name);
	}

	public List<Product> getAllproducts() {
		
		return productDao.getAllproducts();
	}

	public List<Product> getByBrand(String name) {
		return productDao.getByBrand(name);
	}

}
