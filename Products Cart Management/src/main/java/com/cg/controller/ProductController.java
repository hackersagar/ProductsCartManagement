package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.ProductException;
import com.cg.model.Product;
import com.cg.service.IProductService;

@RestController
public class ProductController {
	@Autowired
	private IProductService service;
	@RequestMapping(value="/createproduct",method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) throws ProductException{
		try {
			product=service.createProduct(product);
		} catch (ProductException e) {
			throw new ProductException(e.getMessage());
		}
		return product;
    }
	@RequestMapping(value="/updateproduct", method=RequestMethod.PUT)
	public Product updateEmployee(@RequestBody Product product) throws ProductException {
		
		
		try {
			product=service.updateProduct(product);
		
			
		} catch (ProductException e) {
			
			throw new ProductException(e.getMessage());
		}
		return product;
		
	}
	@RequestMapping(value="/deleteproduct", method=RequestMethod.DELETE)
	public boolean deleteProduct(Product product) throws ProductException {
		boolean b=false;
		try {
			b=service.deleteProduct(product.getId());
			return b;
		} catch (ProductException e) {
			throw new ProductException(e.getMessage());
		}
		
	}
	@RequestMapping(value="/viewproducts", method=RequestMethod.GET)
	public List<Product> viewProducts() throws ProductException {
		List<Product> product1 = null;
		try {
			product1=service.viewProducts();
			return product1;
		} catch (ProductException e) {
			throw new ProductException(e.getMessage());
		}
	}
	@RequestMapping(value="/findproducts", method=RequestMethod.GET)
	public Product findProductById(Product pro) throws ProductException {
		try {
			pro=service.findProductById(pro.getId());
		} catch (ProductException e) {
			throw new ProductException(e.getMessage());
		}
		
		return pro;
	}
}