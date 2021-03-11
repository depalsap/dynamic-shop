package com.dynamic.shop.domainmodels;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "slide_image")
public class SlideImage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long img_id;

	String img_path;
	String img_title_text;
	String img_detail_text;
	String carousel_type;
	
	public SlideImage() {}
		
	public SlideImage(String img_path, String img_title_text, String img_detail_text, String carousel_type) {
		super();
		this.img_path = img_path;
		this.img_title_text = img_title_text;
		this.img_detail_text = img_detail_text;
		this.carousel_type = carousel_type;
	}
	
	public long getImg_id() {
		return img_id;
	}
	public void setImg_id(long img_id) {
		this.img_id = img_id;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	public String getImg_title_text() {
		return img_title_text;
	}
	public void setImg_title_text(String img_title_text) {
		this.img_title_text = img_title_text;
	}
	public String getImg_detail_text() {
		return img_detail_text;
	}
	public void setImg_detail_text(String img_detail_text) {
		this.img_detail_text = img_detail_text;
	}
	
	public String getCarousel_type() {
		return carousel_type;
	}

	public void setCarousel_type(String carousel_type) {
		this.carousel_type = carousel_type;
	}
}
