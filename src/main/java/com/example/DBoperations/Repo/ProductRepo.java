package com.example.DBoperations.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DBoperations.Entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	public  List<Product> findByPname(String pname);

	public List<Product> findByPbrand(String pbrand);

	
}
