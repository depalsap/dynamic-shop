package com.dynamic.shop.domainmodels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long category_id;
	
	String category_name;
	String category_url;
	
	public ProductCategory() {}
	
	public ProductCategory(String category_name, String category_url) {
		super();
		this.category_name = category_name;
		this.category_url = category_url;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_url() {
		return category_url;
	}

	public void setCategory_url(String category_url) {
		this.category_url = category_url;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
	
	
}
