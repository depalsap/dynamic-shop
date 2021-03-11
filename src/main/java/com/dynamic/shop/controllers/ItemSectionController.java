package com.dynamic.shop.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dynamic.shop.domainmodels.ItemSection;
import com.dynamic.shop.repository.ItemSectionRepository;

@Controller
public class ItemSectionController {
	
	@Autowired
	ItemSectionRepository sectionRepo;
	
	//Binding view & the model (form with entity & table)
	@GetMapping("/add-section")
	public String addSection(Model mav){
		ItemSection cmd = new ItemSection();
		mav.addAttribute("cmd", cmd);
		return "home-section";
	}
	
	//Save new records in item_section table
	@RequestMapping("/save-new-section")
	public String save(@ModelAttribute ItemSection sect) {
		sectionRepo.save(sect);
		return "redirect:/add-section";
	}
	
	//Populating section table as a attribute
    @ModelAttribute("sectionList")      
	public List<ItemSection> getSectionList(){
		return sectionRepo.findAll();
	}
    
	//Binding view & the model (form editing)
	@RequestMapping("/edit-selected-section/{id}")
	public String edit(@PathVariable Long id, Model mav){
		ItemSection cmd = sectionRepo.findById(id).get();
		mav.addAttribute("cmd", cmd);
		return "home-section";
	}
	
	//Delete records in section table by id
	@RequestMapping("/delete-selected-section/{id}")
	public String delete(@PathVariable Long id) {
		sectionRepo.deleteById(id);
		return "redirect:/add-section";
	}
}
