package com.florian.geektic.entity;

import java.util.*;
import javax.persistence.*;


@Entity
public class Interest {
	@Id
	private Long id;
	private String label;
	
	@ManyToMany(mappedBy="interests")
	private List<Geek> geeks; 
	
	
	public Interest(Long id, String label) {
		this.id = id;
		this.label = label;
	}
	
	public Interest(String label) {
		this.label = label;
	}	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
}

