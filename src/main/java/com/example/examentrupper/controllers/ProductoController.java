package com.example.examentrupper.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examentrupper.logging.LogExecutionTime;
import com.example.examentrupper.models.ProductoModel;
import com.example.examentrupper.services.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(OrdenController.class);
	
	@Autowired 
	private ProductoService productoService;
	
	@PutMapping(path = "/update/{id}")
	@LogExecutionTime
	public ProductoModel updateProductoById(@RequestBody ProductoModel request, @PathVariable("id") Long id) {
		return this.productoService.updateProductoById(request, id);
	}
	
	@PutMapping(path = "/{id}")
	@LogExecutionTime
	public ProductoModel updatePrecioById(@RequestBody Double precio, @PathVariable("id") Long id) {
		return this.productoService.updatePrecioById(precio, id);
	}
}
