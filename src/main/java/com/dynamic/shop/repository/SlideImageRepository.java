package com.dynamic.shop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dynamic.shop.domainmodels.SlideImage;

@Repository
public interface SlideImageRepository extends JpaRepository<SlideImage, Long>{

}
