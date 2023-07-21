package com.example.examentrupper.repositories;
import com.example.examentrupper.models.OrdenModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IOrdenRepository extends JpaRepository<OrdenModel, Long> {

}
