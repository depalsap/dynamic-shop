package com.dynamic.shop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dynamic.shop.domainmodels.NavLinks;

@Repository
public interface NavLinkRepository extends JpaRepository<NavLinks, Long>{

}
