package com.example.examentrupper.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SUCURSALES")
public class SucursalModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sucursal_id;
	
	@Column
	private String nombre;
}
