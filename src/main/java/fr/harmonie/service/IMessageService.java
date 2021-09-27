package fr.harmonie.service;

public interface IMessageService {
	public findAll();
	public findById(int id);
	public save(Message message);
	public delete(Message message);
	public deleteById(int id);
	public search(Message message);

}
