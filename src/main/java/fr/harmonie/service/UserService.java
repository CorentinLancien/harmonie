package fr.harmonie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.harmonie.dao.IUserDao;
import fr.harmonie.model.Groupe;
import fr.harmonie.model.User;

@Service
public class UserService implements IUserService{
	@Autowired
	private IUserDao daoUser;

	@Override
	public List<User> findAll() {
		return this.daoUser.findAll();
	}

	@Override
	public Optional<User> findById(Integer id) {
		return this.daoUser.findById(id);
	}

	@Override
	public User save(User user) {
		return this.daoUser.save(user);
	}

	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		
	}


}
