package com.cg.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.model.Product;
@Repository
public interface IProductRepo extends JpaRepository<Product, String> {
	@Query("SELECT p FROM Product p where p.id = :id") 
	Product getProduct(@Param("id") String id);
	@Query("SELECT p FROM Product p")
	List<Product> viewAllProducts();

}
