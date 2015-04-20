/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.person;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "PERSON")
public abstract class Person {

	@Id @GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "salary")
	private String email;
	
	@Column (name = "gender") 
	private Gender gender;
	
	@Column (name = "age")
	private Integer age;
	
	@Column (name = "cpf")
	private Long cpf;

}
