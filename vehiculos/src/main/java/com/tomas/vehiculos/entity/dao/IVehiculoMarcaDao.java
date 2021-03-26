package com.tomas.vehiculos.entity.dao;


import org.springframework.data.repository.CrudRepository;
import com.tomas.vehiculos.entity.models.VehiculoMarca;

public interface IVehiculoMarcaDao extends CrudRepository<VehiculoMarca, Integer>{

}
