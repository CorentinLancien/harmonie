package fr.harmonie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.harmonie.model.User;

public interface IUserDao extends JpaRepository<User, Integer> {
	public User findByPseudo(String username);
}
