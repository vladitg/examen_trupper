package com.example.examentrupper.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examentrupper.models.ProductoModel;
import com.example.examentrupper.repositories.IProductoRepository;

@Service
public class ProductoService {

	@Autowired 
	IProductoRepository productoRepository;
	
	public ProductoModel updateProductoById(ProductoModel request, Long id) {
		ProductoModel producto = productoRepository.findById(id).get();
		producto.setCodigo(request.getCodigo());
		producto.setDescripcion(request.getDescripcion());
		producto.setPrecio(request.getPrecio());
		return producto;
	}

	public ProductoModel updatePrecioById(Double precio, Long id) {
		ProductoModel producto = productoRepository.findById(id).get();
		producto.setPrecio(precio);
		return producto;
	}
}
