package HWHibernate.service;

import java.util.List;

import HWHibernate.dao.ContructorsDAO;
import HWHibernate.domain.Contructors;

public class ContructorsServiceImpl implements ContructorsService {

	ContructorsDAO contructorsDAO = null;
	
	public ContructorsServiceImpl(ContructorsDAO contructorsDAO) {
		this.contructorsDAO = contructorsDAO;
	}

	@Override
	public void addNewContructor(Contructors contructors) {
		contructorsDAO.create(contructors);
		
	}

	@Override
	public void addNewContructors(Contructors[] contructors) {
		for(int i = 0; i < contructors.length; i++){
			contructorsDAO.create(contructors[i]);
		}
		
	}

	@Override
	public void updateContructor(Contructors contructors) {
		contructorsDAO.update(contructors);
		
	}

	@Override
	public void deleteContructors(Contructors contructors) {
		contructorsDAO.delete(contructors);
		
	}

	@Override
	public void deleteContructors(int id) {
		contructorsDAO.delete(id);
		
	}

	@Override
	public List<Contructors> getAllContructors() {
		return contructorsDAO.findAll();
	}

}
