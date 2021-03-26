package com.tomas.vehiculos.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomas.vehiculos.entity.dao.ITipoCombustibleDao;
import com.tomas.vehiculos.entity.models.TipoCombustible;


@Service
public class TipoCombustibleServiceImpl implements ITipoCombustibleService{

	@Autowired
	private ITipoCombustibleDao tipoCombustibleDao;
	
	@Override
	public TipoCombustible getOne(int id) {
		return tipoCombustibleDao.findById(id).get();
	}

	@Override
	public List<TipoCombustible> getAll() {
		return (List<TipoCombustible>) tipoCombustibleDao.findAll();
	}

	@Override
	public void insert(TipoCombustible tipoCombustible) {
		tipoCombustibleDao.save(tipoCombustible);
	}

	@Override
	public void update(TipoCombustible tipoCombustible, int id) {
		tipoCombustibleDao.findById(id).ifPresent((X) ->{
			tipoCombustible.setId(id);
			tipoCombustibleDao.save(tipoCombustible);
		} );
	}

	@Override
	public void delete(int id) {
		tipoCombustibleDao.deleteById(id);
	}



}
