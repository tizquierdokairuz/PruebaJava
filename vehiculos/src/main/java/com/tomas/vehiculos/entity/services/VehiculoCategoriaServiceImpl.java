package com.tomas.vehiculos.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomas.vehiculos.entity.dao.IVehiculoCategoriaDao;
import com.tomas.vehiculos.entity.models.VehiculoCategoria;

@Service
public class VehiculoCategoriaServiceImpl implements IVehiculoCategoriaService{

	@Autowired
	private IVehiculoCategoriaDao vehiculoCategoriaDao;
	
	@Override
	public VehiculoCategoria getOne(int id) {
		return vehiculoCategoriaDao.findById(id).get();
	}

	@Override
	public List<VehiculoCategoria> getAll() {
		return (List<VehiculoCategoria>) vehiculoCategoriaDao.findAll();
	}

	@Override
	public void insert(VehiculoCategoria vehiculoCategoria) {
		vehiculoCategoriaDao.save(vehiculoCategoria);
	}

	@Override
	public void update(VehiculoCategoria vehiculoCategoria, int id) {
		vehiculoCategoriaDao.findById(id).ifPresent((X) ->{
			vehiculoCategoria.setId(id);
			vehiculoCategoriaDao.save(vehiculoCategoria);
		} );
	}

	@Override
	public void delete(int id) {
		vehiculoCategoriaDao.deleteById(id);
	}

}
