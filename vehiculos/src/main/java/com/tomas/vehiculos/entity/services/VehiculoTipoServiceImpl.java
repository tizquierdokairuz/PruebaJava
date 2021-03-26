package com.tomas.vehiculos.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomas.vehiculos.entity.dao.IVehiculoTipoDao;
import com.tomas.vehiculos.entity.models.VehiculoTipo;

@Service
public class VehiculoTipoServiceImpl implements IVehiculoTipoService{

	@Autowired
	private IVehiculoTipoDao vehiculoTipoDao;
	
	@Override
	public VehiculoTipo getOne(int id) {
		return vehiculoTipoDao.findById(id).get();
	}

	@Override
	public List<VehiculoTipo> getAll() {
		return (List<VehiculoTipo>) vehiculoTipoDao.findAll();
	}

	@Override
	public void insert(VehiculoTipo vehiculoTipo) {
		vehiculoTipoDao.save(vehiculoTipo);
	}

	@Override
	public void update(VehiculoTipo vehiculoTipo, int id) {
		vehiculoTipoDao.findById(id).ifPresent((X) ->{
			vehiculoTipo.setId(id);
			vehiculoTipoDao.save(vehiculoTipo);
		} );
	}

	@Override
	public void delete(int id) {
		vehiculoTipoDao.deleteById(id);
	}

}
