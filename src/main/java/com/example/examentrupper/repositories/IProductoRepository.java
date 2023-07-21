package com.example.examentrupper.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.examentrupper.models.ProductoModel;

@Repository
public interface IProductoRepository extends CrudRepository<ProductoModel, Long>{

}
