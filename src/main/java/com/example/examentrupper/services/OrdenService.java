package com.example.examentrupper.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.examentrupper.models.OrdenModel;

import com.example.examentrupper.repositories.IOrdenRepository;
import com.example.examentrupper.repositories.IProductoRepository;

@Service
public class OrdenService {

	@Autowired
	IOrdenRepository ordenRepository;
	
	@Autowired
	IProductoRepository productoRepository;
	
	public Optional<OrdenModel>getById(Long id){
		return ordenRepository.findById(id);
	}

	public OrdenModel saveOrden(OrdenModel orden) {
		OrdenModel ordenNueva = ordenRepository.save(orden);
		ordenNueva.getProductos().forEach(
                producto -> {
                	producto.setOrden_id(orden.getOrden_id());
                }
        );
		productoRepository.saveAll(ordenNueva.getProductos());
		return ordenNueva;
	}
}
