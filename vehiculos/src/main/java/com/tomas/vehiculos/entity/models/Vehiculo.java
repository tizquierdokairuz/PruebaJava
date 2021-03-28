package com.tomas.vehiculos.entity.models;

import java.io.Serializable;

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
	@ManyToOne()
    @JoinColumn(name = "idTipo")
    private VehiculoTipo vehiculoTipo;
	
	@NotNull
	@ManyToOne()
    @JoinColumn(name = "idMarca")
    private VehiculoMarca vehiculoMarca;
	
	@NotNull
	@ManyToOne()
    @JoinColumn(name = "idCategoria")
    private VehiculoCategoria vehiculoCategoria;
	
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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	

	public VehiculoTipo getVehiculoTipo() {
		return vehiculoTipo;
	}

	public void setVehiculoTipo(VehiculoTipo vehiculoTipo) {
		this.vehiculoTipo = vehiculoTipo;
	}

	public VehiculoMarca getVehiculoMarca() {
		return vehiculoMarca;
	}

	public void setVehiculoMarca(VehiculoMarca vehiculoMarca) {
		this.vehiculoMarca = vehiculoMarca;
	}

	public VehiculoCategoria getVehiculoCategoria() {
		return vehiculoCategoria;
	}

	public void setVehiculoCategoria(VehiculoCategoria vehiculoCategoria) {
		this.vehiculoCategoria = vehiculoCategoria;
	}

	public Vehiculo(@NotEmpty String nombre, @NotEmpty String codigo, @NotEmpty VehiculoTipo vehiculoTipo, @NotNull VehiculoMarca vehiculoMarca, @NotNull VehiculoCategoria vehiculoCategoria, 
			String observaciones) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.vehiculoTipo = vehiculoTipo;
		this.vehiculoMarca = vehiculoMarca;
		this.vehiculoCategoria = vehiculoCategoria;
		this.observaciones = observaciones;
	}

	public Vehiculo() {
	}

	
	
}
