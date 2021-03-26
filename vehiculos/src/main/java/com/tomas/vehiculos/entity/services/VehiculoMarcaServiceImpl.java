package com.tomas.vehiculos.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomas.vehiculos.entity.dao.IVehiculoMarcaDao;
import com.tomas.vehiculos.entity.models.VehiculoMarca;

@Service
public class VehiculoMarcaServiceImpl implements IVehiculoMarcaService{

	@Autowired
	private IVehiculoMarcaDao vehiculoMarcaDao;
	
	@Override
	public VehiculoMarca getOne(int id) {
		return vehiculoMarcaDao.findById(id).get();
	}

	@Override
	public List<VehiculoMarca> getAll() {
		return (List<VehiculoMarca>) vehiculoMarcaDao.findAll();
	}

	@Override
	public void insert(VehiculoMarca vehiculoMarca) {
		vehiculoMarcaDao.save(vehiculoMarca);
	}

	@Override
	public void update(VehiculoMarca vehiculoMarca, int id) {
		vehiculoMarcaDao.findById(id).ifPresent((X) ->{
			vehiculoMarca.setId(id);
			vehiculoMarcaDao.save(vehiculoMarca);
		} );
	}

	@Override
	public void delete(int id) {
		vehiculoMarcaDao.deleteById(id);
	}

}
