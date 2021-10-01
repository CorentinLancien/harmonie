package fr.harmonie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import fr.harmonie.dao.IMessageDao;
import fr.harmonie.model.Groupe;
import fr.harmonie.model.Message;

@Service
public class MessageService implements IMessageService{
	@Autowired
	private IMessageDao daoMessage;

	@Override
	public List<Message> findAll() {
		return this.daoMessage.findAll();
	}

	@Override
	public Optional<Message> findById(Integer id) {
		return this.daoMessage.findById(id);
	}

	@Override
	public Message save(Message message) {
		return this.daoMessage.save(message);
	}

	@Override
	public void remove(Integer id) {
		this.daoMessage.deleteById(id);
	}

	@Override
	public List<Message> findAllByGroupeId(Integer groupeId) {
		return this.daoMessage.findAllByGroupeId(groupeId)
	}

	@Override
	public List<Message> findAllByUserIdAndGroupeId(Integer userId, Integer groupeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
