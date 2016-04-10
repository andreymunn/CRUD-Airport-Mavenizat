package service.impl;

import java.util.List;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ZboruriDao;
import model.Zboruri;
import service.ZboruriService;

@Service
public class ZboruriServiceImpl implements ZboruriService {
    @Autowired
	private ZboruriDao zboruriDao;
	
	@Transactional
	public void add(Zboruri zboruri) {
		zboruriDao.add(zboruri);

	}

	@Transactional
	public void edit(Zboruri zboruri) {
		zboruriDao.edit(zboruri);

	}

	@Transactional
	public void delete(int id) {
		zboruriDao.delete(id);

	}

	@Transactional
	public Zboruri getZboruri(int id) {
		// TODO Auto-generated method stub
		return zboruriDao.getZboruri(id);
	}

	@Transactional
	public List getAllZboruri() {
		// TODO Auto-generated method stub
		return zboruriDao.getAllZboruri();
	}

}
