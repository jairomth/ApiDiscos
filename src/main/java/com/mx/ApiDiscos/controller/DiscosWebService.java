package com.mx.ApiDiscos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ApiDiscos.model.Discos;
import com.mx.ApiDiscos.service.DiscosImplementacion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

@RequestMapping(path = "DiscosWebService")

@CrossOrigin

public class DiscosWebService {

	@Autowired
	DiscosImplementacion imp;
	// URL: urlServidorLocal/pathClase/pathMetodo

	// http://localhost:9001/DiscosWebService/listar
	@GetMapping(path = "listar")
	public List<Discos> listar() {
		return imp.listar();
	}

	// http://localhost:9001/DiscosWebService/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Discos disco) {
		imp.guardar(disco);
	}

	// http://localhost:9001/DiscosWebService/buscar
	@PostMapping(path = "buscar")
	public Discos buscar(@RequestBody Discos disco) {
		return imp.buscar(disco.getIdD());
	}

	// http://localhost:9001/DiscosWebService/editar
	@PostMapping(path = "editar")
	public void editar(@RequestBody Discos disco) {
		imp.editar(disco);
	}

	// http://localhost:9001/DiscosWebService/eliminar
	@PostMapping(path = "eliminar")
	public void eliminar(@RequestBody Discos disco) {
		imp.eliminar(disco.getIdD());
	}

}
