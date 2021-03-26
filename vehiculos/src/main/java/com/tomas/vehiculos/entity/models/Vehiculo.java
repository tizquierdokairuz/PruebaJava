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
@Table (name = "vehiculo")
public class Vehiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String codigo;
	
	@NotNull
	@Column(name = "idTipo") 
	private int idTipo;
	
	@NotNull
	@Column(name = "idMarca") 
	private int idMarca;
	
	@NotNull
	@Column(name = "idCategoria")  
	private int idCategoria;
	
	private String observaciones;

	
	
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Vehiculo(@NotEmpty String nombre, @NotEmpty String codigo, @NotNull int idTipo, @NotNull int idMarca,
			@NotNull int idCategoria, String observaciones) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.idTipo = idTipo;
		this.idMarca = idMarca;
		this.idCategoria = idCategoria;
		this.observaciones = observaciones;
	}

	public Vehiculo() {
	}

	
	
}
