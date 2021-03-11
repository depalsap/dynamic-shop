package com.dynamic.shop.domainmodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long product_id;
	
	@Column(name = "product_title")
	String product_title;
	String product_descript;
	String product_image;
	double product_price;
	double product_dicount;
	String product_status;
	String product_section;
	String product_category;
	int product_rating;
	
	public Products() {}
	
	public Products(long product_id, String product_title, String product_descript, String product_image,
			double product_price, double product_dicount, String product_status, String product_section,
			String product_category, int product_rating) {
		super();
		this.product_id = product_id;
		this.product_title = product_title;
		this.product_descript = product_descript;
		this.product_image = product_image;
		this.product_price = product_price;
		this.product_dicount = product_dicount;
		this.product_status = product_status;
		this.product_section = product_section;
		this.product_category = product_category;
		this.product_rating = product_rating;
	}

	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	public String getProduct_title() {
		return product_title;
	}
	public void setProduct_title(String product_title) {
		this.product_title = product_title;
	}
	public String getProduct_descript() {
		return product_descript;
	}
	public void setProduct_descript(String product_descript) {
		this.product_descript = product_descript;
	}
	public String getProduct_image() {
		return product_image;
	}
	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public double getProduct_dicount() {
		return product_dicount;
	}
	public void setProduct_dicount(double product_dicount) {
		this.product_dicount = product_dicount;
	}
	public String getProduct_status() {
		return product_status;
	}
	public void setProduct_status(String product_status) {
		this.product_status = product_status;
	}
	
	public String getProduct_section() {
		return product_section;
	}

	public void setProduct_section(String product_section) {
		this.product_section = product_section;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	
	public int getProduct_rating() {
		return product_rating;
	}

	public void setProduct_rating(int product_rating) {
		this.product_rating = product_rating;
	}
	
}
