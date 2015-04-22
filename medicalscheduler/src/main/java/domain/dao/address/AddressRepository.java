/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.dao.address;

import java.io.Serializable;
import java.util.List;

/**
 * @author 964456
 *
 */
public interface AddressRepository <T, Id extends Serializable> {
	
	public void persist(T entity);
	
	public void update(T entity);
	
	public T findById(Id id);
	
	public void delete(T entity);
	
	public List<T> findAll();
	
	public void deleteAll();

}
