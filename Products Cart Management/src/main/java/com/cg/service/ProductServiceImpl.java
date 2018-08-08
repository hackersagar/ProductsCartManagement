package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.ProductException;
import com.cg.model.Product;
import com.cg.repo.IProductRepo;
@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private IProductRepo repo;

	@Override
	public Product createProduct(Product product) throws ProductException {
		
		return repo.save(product);
	}

	@Override
	public Product updateProduct(Product product) throws ProductException {
		Product product1=repo.getProduct(product.getId());
		
		product1.setPrice(product.getPrice());
		product1.setName(product.getName());
		product1.setModel(product.getModel());
		repo.save(product);
		return product;
	}

	@Override
	public boolean deleteProduct(String id) throws ProductException {
		repo.deleteById(id);
		return true;
	}

	@Override
	public List<Product> viewProducts() throws ProductException {
		
		return repo.viewAllProducts();
	}

	@Override
	public Product findProductById(String id) throws ProductException {
		
		return repo.getProduct(id);
	}

	

}
