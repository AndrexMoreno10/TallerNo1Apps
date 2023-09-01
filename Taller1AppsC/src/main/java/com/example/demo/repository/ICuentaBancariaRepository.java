package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.CuentaBancaria;

public interface ICuentaBancariaRepository extends JpaRepository<CuentaBancaria, Long>{

}
