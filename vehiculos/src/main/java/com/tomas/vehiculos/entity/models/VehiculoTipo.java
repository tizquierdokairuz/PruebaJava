package com.tomas.vehiculos.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "vehiculoTipo")
public class VehiculoTipo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	private String nombre;
	
	@NotNull
	@Column(name = "velocidadMaxima") 
	private int velocidadMaxima;
	
	@NotNull
	@Column(name = "idTipoCombustible") 
	private int idTipoCombustible;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getIdTipoCombustible() {
		return idTipoCombustible;
	}

	public void setIdTipoCombustible(int idTipoCombustible) {
		this.idTipoCombustible = idTipoCombustible;
	}

	public VehiculoTipo(@NotEmpty String nombre, @NotNull int velocidadMaxima, @NotNull int idTipoCombustible) {
		super();
		this.nombre = nombre;
		this.velocidadMaxima = velocidadMaxima;
		this.idTipoCombustible = idTipoCombustible;
	}

	public VehiculoTipo() {
	}
}
