package fr.harmonie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import fr.harmonie.dao.IGroupeDao;
import fr.harmonie.model.Groupe;

@Service
public class GroupeService implements IGroupeService{
	@Autowired
	private IGroupeDao daoGroupe;

	@Override
	public List<Groupe> findAll() {
		return this.daoGroupe.findAll();
	}
	
	public Optional<Groupe> findById(Integer id) {
		return this.daoGroupe.findById(id);
	}

	@Override
	public Groupe save(Groupe groupe) {
		return this.daoGroupe.save(groupe);
	}

	@Override
	public void remove(Integer id) {
		this.daoGroupe.deleteById(id);
	}
	
}
