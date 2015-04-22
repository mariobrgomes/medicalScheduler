/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.dao.generic;

import java.util.Map;

/**
 * @author 964456
 *
 */
public interface GenericRepository<T> {
	
    long countAll(Map<String, Object> params);

    T create(T t);

    void delete(Object id);

    T find(Object id);

    T update(T t);  

}
