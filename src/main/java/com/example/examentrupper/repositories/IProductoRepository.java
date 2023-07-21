package com.example.examentrupper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examentrupper.models.ProductoModel;

@Repository
public interface IProductoRepository extends JpaRepository<ProductoModel, Long>{

}
