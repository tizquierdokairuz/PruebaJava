package com.tomas.vehiculos.entity.dao;


import org.springframework.data.repository.CrudRepository;
import com.tomas.vehiculos.entity.models.VehiculoTipo;

public interface IVehiculoTipoDao extends CrudRepository<VehiculoTipo, Integer>{

}
