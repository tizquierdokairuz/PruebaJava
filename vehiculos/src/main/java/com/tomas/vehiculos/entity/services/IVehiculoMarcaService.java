package com.tomas.vehiculos.entity.services;

import java.util.List;

import com.tomas.vehiculos.entity.models.VehiculoMarca;

public interface IVehiculoMarcaService {
	public VehiculoMarca getOne(int id) ;
	public List<VehiculoMarca> getAll();
	public void insert(VehiculoMarca vehiculo);
	public void update(VehiculoMarca vehiculo, int id);
	public void delete(int id);
}
