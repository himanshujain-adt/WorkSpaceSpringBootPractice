package co.alpha.common;

import java.util.List;

public interface BaseServiceInt <T extends BaseDTO> {
	
	public long add(T dto);
	
	public void update(T dto);
	
	public long save(T dto);
	
	public T delete(Long id);
	
	public T findById(Long pk);
	
	public List search(T dto ,int pageNo,int pageSize);
	
	

}
