package com.dynamic.shop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dynamic.shop.domainmodels.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
