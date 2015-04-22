/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.business.plan;

import lombok.Getter;

/**
 * @author 964456
 *
 */
public enum AssistanceSegmentation {
	
	REFERENCED("Referenced"),
	OUTPATIENT("Outpatient"),
	HOSPITAL_WITH_OBSTETRICS("Hospital with Obstetrics"),
	OUTPATIENT_AND_HOSPITAL_WITH_OBSTETRICS("Outpatient and Hospital With Obstetrics");
	
	@Getter private final String description;
	
	private AssistanceSegmentation (final String description){
		this.description = description;
	}

}
