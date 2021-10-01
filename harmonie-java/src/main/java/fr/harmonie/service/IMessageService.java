package fr.harmonie.service;

import java.util.List;
import java.util.Optional;

import fr.harmonie.model.Groupe;
import fr.harmonie.model.Message;

public interface IMessageService {

	public List<Message> findAll();
	public Optional<Message> findById(Integer id);
	public Message save(Message message);
	public void remove(Integer id);

	public List<Message> findAllByGroupeId(Integer groupeId);
	public List<Message> findAllByUserIdAndGroupeId(Integer userId, Integer groupeId);
}
