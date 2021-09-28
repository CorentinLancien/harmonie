package fr.harmonie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.harmonie.model.Message;

public interface IMessageDao  extends JpaRepository<Message, Integer> {


}
