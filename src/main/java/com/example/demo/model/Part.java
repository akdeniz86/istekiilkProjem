package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Part")
public class Part implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false, name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(nullable = false, updatable = false, name = "oemNo", unique = true)
	private String oemNo;

	@Column(name = "manufacturer")
	private String manufacturer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOemNo() {
		return oemNo;
	}

	public void setOemNo(String oemNo) {
		this.oemNo = oemNo;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Part [id=" + id + ", name=" + name + ", oemNo=" + oemNo + ", manufacturer=" + manufacturer + "]";
	}

	public Part(Long id, String name, String oemNo, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.oemNo = oemNo;
		this.manufacturer = manufacturer;
	}

	public Part() {
		super();
	}

}
