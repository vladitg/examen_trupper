package com.example.examentrupper.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.examentrupper.models.OrdenModel;

import com.example.examentrupper.repositories.IOrdenRepository;

@Service
public class OrdenService {

	@Autowired
	IOrdenRepository ordenRepository;
	
	public Optional<OrdenModel>getById(Long id){
		return ordenRepository.findById(id);
	}

	public OrdenModel saveOrden(OrdenModel orden) {
		return ordenRepository.save(orden);
	}
}
