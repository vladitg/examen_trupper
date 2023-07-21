package com.example.examentrupper.controllers;

import com.example.examentrupper.logging.LogExecutionTime;
import com.example.examentrupper.models.OrdenModel;
import com.example.examentrupper.services.OrdenService;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ordenes")
@Slf4j
public class OrdenController {
	@Autowired
	private OrdenService ordenService;
	
	@PostMapping
	@LogExecutionTime
	public OrdenModel saveOrden(@RequestBody OrdenModel orden) {
		return this.ordenService.saveOrden(orden);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<OrdenModel>getOrdenById(@PathVariable("id") Long id){
		return this.ordenService.getById(id);
	}
}
