package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Vehicule;

public interface IVehiculeRepository extends JpaRepository<Vehicule, Long>{

}
