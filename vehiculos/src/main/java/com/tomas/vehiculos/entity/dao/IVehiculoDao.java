package com.tomas.vehiculos.entity.dao;
import com.tomas.vehiculos.entity.models.Vehiculo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Integer>{

    @Query("select e.nombre from Vehiculo e" )
    List<String> getListaNombres();

    @Query("select e.nombre from Vehiculo e WHERE e.vehiculoTipo.id= :idTipo" )
    List<String> findByIdTipo(@Param("idTipo") int idTipo);

    @Query("select e.nombre from Vehiculo e WHERE e.vehiculoCategoria.id= :idCategoria" )
    List<String> findByIdCategoria(@Param("idCategoria") int idCategoria);

}