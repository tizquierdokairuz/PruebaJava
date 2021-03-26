package com.tomas.vehiculos.entity.services;

import java.util.List;

import com.tomas.vehiculos.entity.models.TipoCombustible;

public interface ITipoCombustibleService {
	public TipoCombustible getOne(int id) ;
	public List<TipoCombustible> getAll();
	public void insert(TipoCombustible vehiculo);
	public void update(TipoCombustible vehiculo, int id);
	public void delete(int id);
}
