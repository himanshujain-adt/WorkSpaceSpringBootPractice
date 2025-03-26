package com.example.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public abstract class BaseDAOImpl<T extends BaseDTO> implements BaseDAOInt<T> {

	@Autowired
	EntityManager entityManager;

	public abstract Class<T> getDTOClass();

	@Override
	public long add(T dto) {
		entityManager.persist(dto);
		return dto.getId();
	}

	@Override
	public void update(T dto) {
		entityManager.merge(dto);

	}

	@Override
	public void delete(T dto) {
		entityManager.remove(dto);

	}

	@Override
	public T findByPk(Long pk) {

		return entityManager.find(getDTOClass(), pk);
	}

	@Override
	public List search(T dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
