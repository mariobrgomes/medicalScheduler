/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.person;

import lombok.Getter;

public enum Gender {
	
	FEMALE("Female"),
	MALE("Male");
	
	@Getter private final String description;
	
	private Gender (final String description) {
		this.description = description;
	}
	

	
}
