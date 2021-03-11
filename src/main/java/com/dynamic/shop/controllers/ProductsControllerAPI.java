package com.dynamic.shop.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dynamic.shop.repository.ItemSectionRepository;
import com.dynamic.shop.repository.ProductRepository;
import com.dynamic.shop.domainmodels.ItemSection;
import com.dynamic.shop.domainmodels.Products;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ProductsControllerAPI {
	
	@Autowired ProductRepository productRepo;
	@Autowired ItemSectionRepository sectionRepo;
	
	//fetching products by section for home page
	@GetMapping("/section/{section_Id}")
	public List <Products> getAllProduct(@PathVariable String section_Id){
		return productRepo.getProductBySectionAndStatus(section_Id, "active");
	}
	
	@GetMapping("/section")
	public List <ItemSection> getAllSections(){
		return sectionRepo.findAll();
	}
	
	@GetMapping("/products-search/{keyword}")
	public List <Products> searchProductsByKeyword(@PathVariable(required = false) String keyword){
		return productRepo.searchProducts(keyword);
	}
}
