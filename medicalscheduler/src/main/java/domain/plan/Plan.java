/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.plan;

import java.util.Set;

import lombok.Data;
import domain.coverage.Coverage;

@Data
public abstract class Plan {

	private Long id;
	private String commercialName;
	private Long registerNumber;
	private AssistanceSegmentation assistanceSegmentation;
	private Set<Coverage> coverage;
}
