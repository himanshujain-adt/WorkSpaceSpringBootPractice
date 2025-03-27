package co.alpha.common;

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
		// TODO Auto-generated method stub
		return baseDao.add(dto);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void update(T dto) {
		// TODO Auto-generated method stub
		baseDao.update(dto);;

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public long save(T dto) {
		// TODO Auto-generated method stub
		Long id = dto.getId();
		if (id != null && id > 0) {
			update(dto);

		} else {
			id = add(dto);
		}
		return id;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public T delete(Long id) {
		// TODO Auto-generated method stub
		T dto = findById(id);
		try {
			baseDao.delete(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	@Transactional(readOnly = true)
	public T findById(Long pk) {
		// TODO Auto-generated method stub
		return baseDao.findByPk(pk);
	}

	@Override
	@Transactional(readOnly = true)
	public List search(T dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return baseDao.search(dto, pageNo, pageSize);
	}

}
