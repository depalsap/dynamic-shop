package com.dynamic.shop.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dynamic.shop.domainmodels.ItemSection;
import com.dynamic.shop.repository.ItemSectionRepository;

@Service
public class ItemSectionService {
	
	@Autowired
	private ItemSectionRepository sectionRepo;
	
	public List<ItemSection> getAllsection() {
		return sectionRepo.findAll();
	}
}
