package com.dynamic.shop.domainmodels;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nav_links")
public class NavLinks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long nav_id;

	@Column(name = "nav_name")
	String nav_name;
	String nav_url;

	public NavLinks() {}

	public NavLinks(String nav_name, String nav_url) {
		super();
		this.nav_name = nav_name;
		this.nav_url = nav_url;
	}

	public long getNav_id() {
		return nav_id;
	}
	public void setNav_id(long nav_id) {
		this.nav_id = nav_id;
	}
	public String getNav_name() {
		return nav_name;
	}
	public void setNav_name(String nav_name) {
		this.nav_name = nav_name;
	}
	public String getNav_url() {
		return nav_url;
	}
	public void setNav_url(String nav_url) {
		this.nav_url = nav_url;
	}
}
