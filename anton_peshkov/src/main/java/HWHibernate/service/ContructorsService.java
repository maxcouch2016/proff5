package HWHibernate.service;

import java.util.List;

import HWHibernate.domain.Contructors;

public interface ContructorsService {
	void addNewContructor(Contructors contructors);
	void addNewContructors(Contructors[] contructors);
	void updateContructor(Contructors contructors);
	void deleteContructors(Contructors contructors);
	void deleteContructors(int id);
	List<Contructors> getAllContructors();
}
