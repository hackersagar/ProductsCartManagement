package com.cg.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
public class Product {
	@Id
	@Column(name="id")
	private String id;
	@Column(name="name")
	private String Name;
	@Column(name="model")
	private String model;
	@Column(name="price")
	private Double price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
