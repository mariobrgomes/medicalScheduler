/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.business.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author 964456
 *
 */

@Data
@Entity
public class Address {
	
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column (name = "addressNb")
	private int adressNb;
	
	@Column (name = "cep")
	private int cep;
	
	@Column(name = "street")
	private String street;
	
	@Column (name = "complement")
	private String complement;
	
	@Column (name = "neighborhood")
	private String neighborhood;
	
	@Column (name = "city")
	private CityList cityList;
	
	@Column (name = "state")
	private StateList stateList;
	
}
