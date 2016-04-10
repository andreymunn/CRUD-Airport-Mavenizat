package service;

import java.util.List;

import model.Zboruri;

public interface ZboruriService {
	public void add(Zboruri zboruri);
	public void edit(Zboruri zboruri);
	public void delete(int id);
	public Zboruri getZboruri(int id);
	@SuppressWarnings("rawtypes")
	public List getAllZboruri();
	
}
