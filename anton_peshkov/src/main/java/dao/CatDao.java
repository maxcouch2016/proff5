package dao;

import java.util.List;

import domain.Cat;

public interface CatDao {
	Long create(Cat product);
	Cat read(Long id);
	void update(Cat product);
	void delete(Cat product);
	List<Cat> findAll();
}
