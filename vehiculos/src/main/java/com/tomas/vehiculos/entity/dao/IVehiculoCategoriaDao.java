package com.tomas.vehiculos.entity.dao;


import org.springframework.data.repository.CrudRepository;
import com.tomas.vehiculos.entity.models.VehiculoCategoria;

public interface IVehiculoCategoriaDao extends CrudRepository<VehiculoCategoria, Integer>{

}
