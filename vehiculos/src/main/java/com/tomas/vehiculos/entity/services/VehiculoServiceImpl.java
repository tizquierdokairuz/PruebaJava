package com.tomas.vehiculos.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomas.vehiculos.entity.dao.IVehiculoDao;
import com.tomas.vehiculos.entity.models.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoDao vehiculoDao;
	
	@Override
	public Vehiculo getOne(int id) {
		return vehiculoDao.findById(id).get();
	}

	@Override
	public List<Vehiculo> getAll() {
		return (List<Vehiculo>) vehiculoDao.findAll();
	}

	@Override
	public void insert(Vehiculo vehiculo) {
		vehiculoDao.save(vehiculo);
	}

	@Override
	public void update(Vehiculo vehiculo, int id) {
		vehiculoDao.findById(id).ifPresent((X) ->{
			vehiculo.setId(id);
			vehiculoDao.save(vehiculo);
		} );
	}

	@Override
	public void delete(int id) {
		vehiculoDao.deleteById(id);
	}

}
