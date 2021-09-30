package fr.harmonie.service;

import java.util.List;
import java.util.Optional;

import fr.harmonie.model.Groupe;
import fr.harmonie.model.User;

public interface IUserService {

	public List<User> findAll();
	public User findByPseudo(String username);
	public Optional<User> findById(Integer id);
	public User save(User user);
	public void remove(Integer id);
	
	
}
