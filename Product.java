/*
 * the product java use to make the table in sql with the help of @table(allocation) use to create table and we give name procuct to table name
 * we assgin the table column name in this field like id,prodname ,price etc it take the info from the form and arrange by thier column name
 */
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Product")//Relation or Relational Table  
@Entity//informs or signals that this is Entity Java Bean Class 

public class Product {
	
	@Id	
	private int id;
	private String prodname;
	private int price;
	private int qty;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	

}
