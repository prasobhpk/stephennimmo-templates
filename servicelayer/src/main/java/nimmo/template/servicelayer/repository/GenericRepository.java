package nimmo.template.servicelayer.repository;

import java.io.Serializable;
import java.util.List;

public interface GenericRepository<ID extends Serializable, T> {
	 
    T findById(ID id, boolean lock);
 
    List<T> findAll();
 
    T saveOrUpdate(T entity);
    
    void delete(ID id);
 
    void delete(T entity);
    
}

