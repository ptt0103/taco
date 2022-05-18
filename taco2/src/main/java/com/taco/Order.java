package com.taco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Taco_Order")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private Date placedAt;
	private String ccNumber;
	private String ccExpiration;
	private String ccCVV;
	
	@ManyToMany(targetEntity=Taco.class)
	private List<Taco> tacos = new ArrayList<>();
	public void addDesign(Taco design){this.tacos.add(design);}
	
	@PrePersist
	void placedAt() {
	this.placedAt = new Date();
	}
	
}
