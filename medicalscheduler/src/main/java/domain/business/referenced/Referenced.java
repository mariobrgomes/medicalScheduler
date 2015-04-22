/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.business.referenced;

import domain.business.address.Address;

/**
 * @author 964456
 *
 */
@Entity

public class Referenced {
	
	private Long id;
	private int phoneNb;
	private Address adress;
	private Specialty specialty;
	private String webSite;
	private String name;

}
