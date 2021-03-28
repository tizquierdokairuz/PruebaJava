package com.tomas.vehiculos.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	@GetMapping("/vehiculoDetalles")
	public List<Vehiculo> getAllVehiculos(){
		return vehiculoService.getAll();
	}
	
	@GetMapping("/vehiculoNombres")
	public List<String> getAllVehiculoNombres(){
		return vehiculoService.getListaNombres();
	}

	@GetMapping("/vehiculoNombresTipo/{id}")
	public List<String> getAllVehiculoNombresPorTipo(@PathVariable(value = "id") int id) {
			return vehiculoService.getListaNombresPorTipo(id);
	}

	@GetMapping("/vehiculoNombresCategoria/{id}")
	public List<String> getAllVehiculoNombresPorCategoria(@PathVariable(value = "id") int id){
			return vehiculoService.getListaNombresPorCategoria(id);
	}

	@GetMapping("/vehiculos/{id}")
	public Vehiculo getOne(@PathVariable(value = "id") int id){
		return vehiculoService.getOne(id);
	}
	
	@PostMapping("/vehiculos")
	public void add(Vehiculo vehiculo){
			vehiculoService.insert(vehiculo);
	}	
	
	@PutMapping("/vehiculos/{id}")
	public void update(Vehiculo vehiculo,@PathVariable(value = "id") int id){
			vehiculoService.update(vehiculo,id);
	}	
	
	@DeleteMapping("/vehiculos/{id}")
	public void delete(@PathVariable(value = "id") int id){
			vehiculoService.delete(id);
	}		
	
}