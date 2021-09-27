package fr.harmonie.dao;

public interface IGroupeDao {
	public findAll();
	public findById(int id);
	public save(Groupe groupe);
	public delete(Groupe groupe);
	public deleteById(int id);
	public search(Groupe groupe);
	
	
}
