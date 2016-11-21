package HWHibernate.dao;

import java.util.List;

import HWHibernate.domain.Contructors;

public interface ContructorsDAO {
	Long create(Contructors contructors);
	Contructors read(Long id);
	void update(Contructors product);
	void delete(Contructors product);
	void delete(int id);
	List<Contructors> findAll();
}
