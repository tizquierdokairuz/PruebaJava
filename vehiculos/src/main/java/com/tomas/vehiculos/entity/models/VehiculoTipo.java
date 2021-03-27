package com.tomas.vehiculos.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@ManyToOne()
    @JoinColumn(name = "idTipoCombustible")
    private TipoCombustible tipoCombustible;
	
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

	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	public VehiculoTipo(@NotEmpty String nombre, @NotNull int velocidadMaxima, @NotNull TipoCombustible tipoCombustible) {
		super();
		this.nombre = nombre;
		this.velocidadMaxima = velocidadMaxima;
		this.tipoCombustible = tipoCombustible;
	}

	public VehiculoTipo() {
	}
}
