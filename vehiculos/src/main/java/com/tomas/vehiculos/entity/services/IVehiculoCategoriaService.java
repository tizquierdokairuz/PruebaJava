package com.tomas.vehiculos.entity.services;

import java.util.List;

import com.tomas.vehiculos.entity.models.VehiculoCategoria;

public interface IVehiculoCategoriaService {
	public VehiculoCategoria getOne(int id) ;
	public List<VehiculoCategoria> getAll();
	public void insert(VehiculoCategoria vehiculo);
	public void update(VehiculoCategoria vehiculo, int id);
	public void delete(int id);
}
