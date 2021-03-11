package com.dynamic.shop.domainmodels;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_section")
public class ItemSection {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long section_Id;
	
	@Column(name="section_name")
	String section_name;
	String section_url;
	
	public ItemSection() {}
	
	public ItemSection(String section_name, String section_url) {
		super();
		this.section_name = section_name;
		this.section_url = section_url;
	}
	
	public long getSection_Id() {
		return section_Id;
	}
	public void setSection_Id(long section_Id) {
		this.section_Id = section_Id;
	}
	public String getSection_name() {
		return section_name;
	}
	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}
	public String getSection_url() {
		return section_url;
	}
	public void setSection_url(String section_url) {
		this.section_url = section_url;
	}
	
}
