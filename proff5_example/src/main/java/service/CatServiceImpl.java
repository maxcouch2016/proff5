package service;

import java.util.List;

import dao.CatDao;
import domain.Cat;

public class CatServiceImpl implements CatService{
	private CatDao catDao = null;
	
	public CatServiceImpl(CatDao catDao){
		this.catDao = catDao;		
	}
	
	@Override
	public void addNewCat(Cat cat) {
		catDao.create(cat);
		
	}

	@Override
	public void addNewCats(Cat[] cats) {
		for(Cat cat: cats){
			catDao.create(cat);
		}		
	}

	@Override
	public void updateCat(Cat cat) {
		catDao.update(cat);		
	}

	@Override
	public List<Cat> getAllCats() {		
		return catDao.findAll();
	}
}
