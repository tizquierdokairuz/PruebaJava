package com.tomas.vehiculos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomas.vehiculos.entity.models.Vehiculo;
import com.tomas.vehiculos.entity.services.IVehiculoService;

@RestController
public class VehiculoController {
	
	@Autowired
	IVehiculoService vehiculoService;

	@GetMapping("/vehiculos")
	public List<Vehiculo> getAllVehiculos(){
		return vehiculoService.getAll();
	}
	
	@GetMapping("/vehiculos/{id}")
	public Vehiculo getOne(@PathVariable(value = "id") int id){
		return vehiculoService.getOne(id);
	}
	
	@PostMapping("/vehiculos")
	public void add(Vehiculo vehiculo){
		vehiculoService.insert(vehiculo);
	}	
	
	@PutMapping("/vehiculos")
	public void update(Vehiculo vehiculo,int id){
		vehiculoService.update(vehiculo,id);
	}		
	
}
