package com.example.examentrupper.repositories;
import com.example.examentrupper.models.OrdenModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IOrdenRepository extends CrudRepository<OrdenModel, Long> {

}
