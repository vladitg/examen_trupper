package com.example.examentrupper.models;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "ORDENES")
public class OrdenModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orden_id;
	
	@Column
	private Long sucursal_id;
	
	@Column
	private Date fecha;
	
	@Column
	private Double total;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orden_id", cascade = CascadeType.ALL)
    private List<ProductoModel> productos;

	public OrdenModel() {
	}
	
	public OrdenModel(Long sucursal_id, Date fecha, Double total) {
		this.sucursal_id = sucursal_id;
		this.fecha = fecha;
		this.total = total;
	}
	
	public Long getOrden_id() {
		return orden_id;
	}

	public void setOrden_id(Long orden_id) {
		this.orden_id = orden_id;
	}

	public Long getSucursal_id() {
		return sucursal_id;
	}

	public void setSucursal_id(Long sucursal_id) {
		this.sucursal_id = sucursal_id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<ProductoModel> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoModel> productos) {
		this.productos = productos;
	}

	
	
}
