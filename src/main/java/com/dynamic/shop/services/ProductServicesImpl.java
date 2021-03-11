package com.dynamic.shop.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dynamic.shop.domainmodels.Products;
import com.dynamic.shop.repository.ProductRepository;

@Service
public class ProductServicesImpl{

	@Autowired
	private ProductRepository productRepo;

	public List<Products> getAllproducts() {
		return productRepo.findAll();
	}
}
