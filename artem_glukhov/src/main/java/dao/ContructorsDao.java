package dao;

import java.util.List;

import domain.Contructors;

public interface ContructorsDao {
	Long create(Contructors name);
	Contructors read(Long id);
	void update(Contructors name);
	void delete(Contructors product);
	List<Contructors> findALL();
	

}
