/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.dao.address;

import java.util.List;

import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author 964456
 *
 */
public class AddressDAO implements AddressRepository<T, Id> {
	
	private Session currentSession;
	
	private Transaction currentTransaction;
	
	public AddressDAO() {
		
	}
	

	public Session openCurrentSession() {
		currentSession =  getSessionFactory().
	}
	
	public void persist(T entity) {
		// TODO Auto-generated method stub
		
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	public T findById(Id id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
