package com.dynamic.shop.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.dynamic.shop.domainmodels.ProductCategory;
import com.dynamic.shop.repository.ProductCategoryRepository;

@Controller
public class ProductCategoryController {

	@Autowired
	ProductCategoryRepository categoryRepo;
	
	//Binding view & the model (form with entity & table)
	@GetMapping("/add-category")
	public String addCategory(Model mav){
		ProductCategory cmd = new ProductCategory();
		mav.addAttribute("cmd", cmd);
		return "add-category";
	}
	
	//Populating section table as a attribute
    @ModelAttribute("categoryList")      
	public List<ProductCategory> getCategoryList(){
		return categoryRepo.findAll();
	}
}
