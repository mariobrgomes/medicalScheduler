/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.business.referenced;

import lombok.Getter;

/**
 * @author 964456
 *
 */
public enum Specialty {
	
	TODAS_AS_ESPECIALIDADES(1, "Todas as Especialidades"),
	DERMATOLOGIA(2, "Dermatologia"),
	ENDOCRINOLOGIA(3, "Endocrinologia"),
	ALERGOLOGIA(4, "Alergologia"),
	CARDIOLOGIA(5, "Cardiologia"),
	CLINICA_MEDICA(6, "Clinica Médica"),
	FISIOTERAPIA(7, "Fisioterapia"),
	NEUROLOGIA(8, "Neurologia");
	
	@Getter private String description;
	@Getter private int id;
	
	private Specialty (final int id, final String description) {
		this.id = id;
		this.description = description;
	}

}
