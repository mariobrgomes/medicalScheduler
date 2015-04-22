/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.business.address;

import lombok.Getter;

public enum StateList {
	
	SAO_PAULO(1, "São Paulo"),
	RIO_DE_JANEIRO(2, "Rio de Janeiro"),
	MINAS_GERAIS(3, "Belo Horizonte"),
	RIO_GRANDE_DO_SUL(4, "Rio Grande do Sul"),
	PERNAMBUCO(5, "Pernambuco"),
	ALAGOAS(6, "Alagoas"),
	DISTRITO_FEDERAL(7, "Distrito Federal"),
	GOIAS(8, "Goias");
	
	@Getter private String description;
	@Getter private int id;
	
	private StateList (final int id, final String description) {
		this.id = id;
		this.description = description;
	}

}
