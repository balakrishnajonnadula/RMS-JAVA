package com.rms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "INVENTORY_TBL")
public class InventoryEntity {

	@Id
	@GeneratedValue(generator = "inventory-id-generator")
	@GenericGenerator(name = "inventory-id-generator", strategy = "com.rms.generators.InventoryGenerator")
	private String itemId;

	private String name;

	private String discription;

	private double price;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity category;
	
}
