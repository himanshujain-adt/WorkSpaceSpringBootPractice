package co.alpha.common;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository // Marks this class as a Spring Data repository
@Transactional // Ensures DB operations are transactional
public abstract class BaseDAOImpl<T extends BaseDTO> implements BaseDAOInt<T> {

    @PersistenceContext // Correct annotation for EntityManager injection
    protected EntityManager entityManager;

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
        entityManager.remove(entityManager.contains(dto) ? dto : entityManager.merge(dto)); // Ensures removal works
    }

    @Override
    public T findByPk(Long pk) {
        return entityManager.find(getDTOClass(), pk);
    }

    @Override
    public List<T> search(T dto, int pageNo, int pageSize) {
        // TODO: Implement search functionality
        return null;
    }
}
