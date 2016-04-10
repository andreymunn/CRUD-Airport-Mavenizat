package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.ZboruriDao;
import model.Zboruri;

@Repository
public class ZboruriDaoImpl implements ZboruriDao {
    
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Zboruri zboruri) {
		
       session.getCurrentSession().save(zboruri);
	}

	@Override
	public void edit(Zboruri zboruri) {
		session.getCurrentSession().update(zboruri);

	}

	@Override
	public void delete(int id) {
		session.getCurrentSession().delete(getZboruri(id));

	}

	@Override
	public Zboruri getZboruri(int id) {
		
		return (Zboruri)session.getCurrentSession().get(Zboruri.class , id);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getAllZboruri() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Zboruri").list();
	}

}
