/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.business.plan;

import domain.business.address.CityList;
import lombok.Data;


@Data
public class NationalPlan extends Plan {
	
	private CityList city;
	private String registerNb;
	
}
