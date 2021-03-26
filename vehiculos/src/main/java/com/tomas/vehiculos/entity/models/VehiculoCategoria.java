package com.tomas.vehiculos.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "vehiculoCategoria")
public class VehiculoCategoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	private int a�o;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public VehiculoCategoria(@NotNull int a�o) {
		super();
		this.a�o = a�o;
	}

	public VehiculoCategoria() {
	}

}
