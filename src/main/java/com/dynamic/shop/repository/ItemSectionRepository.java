package com.dynamic.shop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dynamic.shop.domainmodels.ItemSection;

@Repository
public interface ItemSectionRepository extends JpaRepository<ItemSection, Long>{

}
