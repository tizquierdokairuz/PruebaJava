package com.tomas.vehiculos.entity.services;

import java.util.List;

import com.tomas.vehiculos.entity.models.VehiculoTipo;

public interface IVehiculoTipoService {
	public VehiculoTipo getOne(int id) ;
	public List<VehiculoTipo> getAll();
	public void insert(VehiculoTipo vehiculo);
	public void update(VehiculoTipo vehiculo, int id);
	public void delete(int id);
}
