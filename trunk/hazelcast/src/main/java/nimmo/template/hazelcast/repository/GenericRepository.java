package nimmo.template.hazelcast.repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface GenericRepository<ID extends Serializable, T> {
	 
    T findById(ID id);
    
    List<T> findByIds(Collection<ID> ids);
 
    List<T> findAll();
 
    T saveOrUpdate(T entity);
    
    void delete(ID id);
 
    void delete(T entity);
    
}

