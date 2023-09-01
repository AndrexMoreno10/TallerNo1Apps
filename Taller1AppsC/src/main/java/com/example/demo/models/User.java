package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class User {
	
	@Id // 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Para que pueda ser AutoIngrement
	private Long id;
	private String nombre;
	private String apellido;
	private String edad;
	private String telefono;
	
	public User() {
		super();
	}

	public User(String nombre, Long id, String edad, String apellido, String telefono) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	

}
