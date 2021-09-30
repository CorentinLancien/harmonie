package fr.harmonie.service;

import java.util.List;
import java.util.Optional;

import fr.harmonie.model.Groupe;


public interface IGroupeService {

	public List<Groupe> findAll();
	public Optional<Groupe> findById(Integer id);
	public Groupe save(Groupe groupe);
	public void remove(Integer id);

}
