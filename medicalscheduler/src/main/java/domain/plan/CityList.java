/**
 * Code developed by Mário Gomes (mariobrgomes91@gmail.com)
 * This code can't be replicated unless you contact the author with the intended purpose.	
 */
package domain.plan;

import lombok.Getter;

public enum CityList {
	
	SAO_PAULO(1, "São Paulo"),
	RIO_DE_JANEIRO(2, "Rio de Janeiro"),
	BELO_HORIZONTE(3, "Belo Horizonte"),
	CAMPINAS(4, "Campinas"),
	SALVADOR(5, "Salvador"),
	RECIFE(6, "Recife"),
	BLUMENAU(7, "Blumenau"),
	PORTO_ALEGRE(8, "Porto Alegre");
	
	@Getter private String description;
	@Getter private int id;
	
	private CityList (final int id, final String description) {
		this.id = id;
		this.description = description;
	}

}
