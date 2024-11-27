package com.mx.ApiDiscos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*CREATE TABLE DISCOS(
ID NUMBER PRIMARY KEY,
NOMBRE VARCHAR2(40) NOT NULL,
GENERO VARCHAR2(40) NOT NULL,
PRECIO NUMBER NOT NULL
);*/

@Entity
@Table(name = "DISCOS")

public class Discos {
	@Id
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	private Integer idD;

	@Column(name = "NOMBRE", columnDefinition = "VARCHAR2(40)", nullable = false)
	private String nombre;

	@Column(name = "GENERO", columnDefinition = "VARCHAR2(40)", nullable = false)
	private String genero;

	@Column(name = "PRECIO", columnDefinition = "NUMBER", nullable = false)
	private Float precio;

	public Discos() {
	}

	public Discos(Integer idD, String nombre, String genero, Float precio) {
		this.idD = idD;
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Discos [idD=" + idD + ", nombre=" + nombre + ", genero=" + genero + ", precio=" + precio + "]";
	}

	public Integer getIdD() {
		return idD;
	}

	public void setIdD(Integer idD) {
		this.idD = idD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

}
