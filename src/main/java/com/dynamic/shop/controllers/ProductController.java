package com.dynamic.shop.controllers;
import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dynamic.shop.domainmodels.ItemSection;
import com.dynamic.shop.domainmodels.ProductCategory;
import com.dynamic.shop.domainmodels.Products;
import com.dynamic.shop.repository.ItemSectionRepository;
import com.dynamic.shop.repository.ProductCategoryRepository;
import com.dynamic.shop.repository.ProductRepository;
import com.dynamic.shop.services.ProductServicesImpl;

@Controller
public class ProductController {

	@Autowired
	private ProductServicesImpl pservices;
	@Autowired
    private ProductRepository productRepo;
	@Autowired
	private ItemSectionRepository sectionRepo;
	@Autowired
	private ProductCategoryRepository categoryRepo;
	
	//Manipulate section list control
	@ModelAttribute("sectionList")
	public List<ItemSection> getSectionList(){
		return sectionRepo.findAll();
	}
	
	//Manipulate category list control
	@ModelAttribute("categoryList")
	public List<ProductCategory> getCategoryList(){
		return categoryRepo.findAll();
	}

	//Get all products for home
	@GetMapping("/")
	public String viewHomePage(Model mav){
		mav.addAttribute("listProducts", pservices.getAllproducts());
		return "index";
	}
	
	//Binding view & the model (form with entity & table for adding record)
	@GetMapping("/addproduct")
	public String addProducts(Model mav){
		Products cmd = new Products();
		mav.addAttribute("cmd", cmd);
		return "addproduct";
	}
	
	//Binding view & the model (form editing)
	@RequestMapping("/edit-selected-item/{id}")
	public String edit(@PathVariable Long id, Model mav){
		Products cmd = productRepo.findById(id).get();
		mav.addAttribute("cmd", cmd);
		return "addproduct";
	}
	
	//Save new records in products table
	@RequestMapping("/save-new-product")
	public String save(@ModelAttribute Products prod) {
		productRepo.save(prod);
		return "redirect:/addproduct";
	}
	
	//Delete records in products table by id
	@RequestMapping("/delete-selected-item/{id}")
	public String delete(@PathVariable Long id) {
		productRepo.deleteById(id);
		return "redirect:/products";
	}
	
	//get all products for products page
	@GetMapping("/products")
	public String viewProducts(Model mav){
		mav.addAttribute("listProducts", pservices.getAllproducts());
		return "products";
	}
	
	//get all products by section for products page
	@GetMapping("/products-by-section/{section_Id}")
	public String viewProductsbySection(@PathVariable(required = false) String section_Id, Model mav){
		
		mav.addAttribute("listProducts", productRepo.getProductBySection(section_Id));
		return "products";
	}
	
	@GetMapping("/products-search/{keyword}")
	public String searchProductsByKeyword(@PathVariable(required = false) String keyword, Model mav){
		
		mav.addAttribute("listProducts", productRepo.searchProducts(keyword));
		return "products";
	}
	
	@PostMapping("/uploadImage")
	public ResponseEntity<?> handleFileUpload( @RequestParam("file") MultipartFile file){
		
		String fileName = file.getOriginalFilename();
		
		try {
			file.transferTo(new File("C:\\upload\\"+fileName));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok("File upload succesfull.");
		
	}
	
}
