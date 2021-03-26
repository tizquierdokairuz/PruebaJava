package com.tomas.vehiculos.entity.dao;

import com.tomas.vehiculos.entity.models.Vehiculo;
import org.springframework.data.repository.CrudRepository;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Integer>{

}
