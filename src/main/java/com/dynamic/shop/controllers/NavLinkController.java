package com.dynamic.shop.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dynamic.shop.domainmodels.NavLinks;
import com.dynamic.shop.repository.NavLinkRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class NavLinkController {
	
	@Autowired
	private NavLinkRepository navLinkRepo;
	
	//Get all navLinks
	@GetMapping("/navlinks")
	public List <NavLinks> getAllNavLinks(){
		return navLinkRepo.findAll();
	}
	
	//Create new NavLinks restAPI
	@PostMapping("/navlinks")
	public NavLinks createNavLinks(@RequestBody NavLinks navLinks) {
		return navLinkRepo.save(navLinks);
	}
}
