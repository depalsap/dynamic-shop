package com.dynamic.shop.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dynamic.shop.domainmodels.SlideImage;
import com.dynamic.shop.repository.SlideImageRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class SlideImageController {
	
	@Autowired
	private SlideImageRepository imageSlideRepo;
	
	//Get all ImageSlides
	@GetMapping("/slideimg")
	public List <SlideImage> getAllSlideImages(){
		return imageSlideRepo.findAll();
	}
	
	//Create new ImageSlide restAPI
	@PostMapping("/slideimg")
	public SlideImage createSlideImage(@RequestBody SlideImage slideImage) {
		return imageSlideRepo.save(slideImage);
	}
}
