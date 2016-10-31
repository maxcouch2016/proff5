package service;

import java.util.List;

import domain.Cat;

public interface CatService {
	void addNewCat(Cat cat);
	void addNewCats(Cat[] cats);
	void updateCat(Cat cat);
	List<Cat> getAllCats();
}
