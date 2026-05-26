package com.skillio;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity 
public class User {

	@Id
	private int id;
	private String name;
	private String address;

	@ManyToMany
	private List<Document> docs;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public List<Document> getDocs() {
		return docs;
	}
	public void setDocs(List<Document> docs) {
		this.docs = docs;
	}
	public User() {}
	
	
	public User(int id, String name, String address, List<Document> docs) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.docs = docs;
	}
	
	
	
	
}
