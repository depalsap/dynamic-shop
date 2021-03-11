package com.dynamic.shop.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.dynamic.shop.domainmodels.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long>{

	//JPQL: Java persistence query language
	@Query("SELECT pd from Products pd WHERE product_section=?1 ORDER BY product_id DESC" )
	public List<Products> getProductBySection(String section);
	
	@Query("SELECT pd from Products pd WHERE product_section=?1 AND product_status=?2" )
	public List<Products> getProductBySectionAndStatus(String section, String status);
	
	@Query
	(value = "SELECT p FROM Products p WHERE p.product_title LIKE '%' || :keyword || '%'"
	+ " OR p.product_id LIKE '%' || :keyword || '%'"
    + " OR p.product_descript LIKE '%' || :keyword || '%'")

	public List<Products> searchProducts(@Param("keyword") String keyword);
	
	//Native Query SQL
	
}
