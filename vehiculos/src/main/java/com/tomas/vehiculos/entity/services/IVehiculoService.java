package com.tomas.vehiculos.entity.services;

import java.util.List;

import com.tomas.vehiculos.entity.models.Vehiculo;

public interface IVehiculoService {
	public Vehiculo getOne(int id) ;
	public List<Vehiculo> getAll();
	public void insert(Vehiculo vehiculo);
	public void update(Vehiculo vehiculo, int id);
	public void delete(int id);
}
