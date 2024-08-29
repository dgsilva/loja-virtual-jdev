package jdev.mentoria.lojavirtual.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pessoa_juridica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa {

	private static final long serialVersionUID = 1L;
	@Column(nullable = false)
	private String cnpj;
	@Column(nullable = false)
	private String inscEstadual;
	private String inscMunicipal;
	@Column(nullable = false)
	private String nomeFantasia;
	@Column(nullable = false)
	private String razaoSocial;
	private String categoria;
	
	
}
