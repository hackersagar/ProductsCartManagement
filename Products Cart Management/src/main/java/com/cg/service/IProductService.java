package com.cg.service;

import java.util.List;
import java.util.Optional;

import com.cg.exception.ProductException;
import com.cg.model.Product;



public interface IProductService {
	public Product createProduct(Product product) throws ProductException;
	public Product updateProduct(Product product) throws ProductException;
	public boolean deleteProduct(String id) throws ProductException;
	public List<Product> viewProducts() throws ProductException;
	public Product findProductById(String id) throws ProductException;

}
