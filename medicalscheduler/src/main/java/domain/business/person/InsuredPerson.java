/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.business.person;

import lombok.Data;
import domain.business.plan.Plan;

@Data
public class InsuredPerson extends Person {
	
	private Plan plan;
}
