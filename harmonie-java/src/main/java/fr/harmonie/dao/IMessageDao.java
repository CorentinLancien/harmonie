package fr.harmonie.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.harmonie.model.Message;

public interface IMessageDao  extends JpaRepository<Message, Integer> {


}
