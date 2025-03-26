package com.example.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BaseServiceImpl<T extends BaseDTO, D extends BaseDAOInt<T>> implements BaseServiceInt<T> {
	
	@Autowired
	protected D baseDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public long add(T dto) {
	
		return baseDao.add(dto) ;
	}

	@Override
	public void update(T dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public long save(T dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findById(Long pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List search(T dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
