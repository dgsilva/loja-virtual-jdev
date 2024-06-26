package jdev.mentoria.lojavirtual.enums;

import lombok.Getter;

@Getter
public enum TipoEndereco {

	COBRANCA("Cobranca"),
	ENTREGA("Entrega");
	
	private String descricao;
	
	private TipoEndereco(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
