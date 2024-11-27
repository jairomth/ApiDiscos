package com.mx.ApiDiscos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.ApiDiscos.dao.DiscosDao;
import com.mx.ApiDiscos.model.Discos;

@Service
public class DiscosImplementacion implements DiscosServ {

	@Autowired
	DiscosDao discoDao;

	@Transactional(readOnly = true)
	@Override
	public List<Discos> listar() {
		return discoDao.findAll();
	}

	@Transactional
	@Override
	public void guardar(Discos disco) {
		discoDao.save(disco);
	}

	@Transactional(readOnly = true)
	@Override
	public Discos buscar(Integer id) {
		return discoDao.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void editar(Discos disco) {
		discoDao.save(disco);
	}

	@Override
	public void eliminar(Integer id) {
		discoDao.deleteById(id);
	}

}
