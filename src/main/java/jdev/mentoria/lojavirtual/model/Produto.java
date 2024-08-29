package jdev.mentoria.lojavirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@Entity
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
	private Long id;
	@Column(nullable = false)
	private String tipoUnidade;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private Boolean ativo = Boolean.TRUE;
	@Column(columnDefinition = "text", length = 2000, nullable = false)
	private String descricao;
	/*nota item do produto - associar*/
	@Column(nullable = false)
	private Double peso;
	@Column(nullable = false)
	private Double largura;
	@Column(nullable = false)
	private Double altura;
	@Column(nullable = false)
	private Double profundidade;
	@Column(nullable = false)
	private BigDecimal valorVenda = BigDecimal.ZERO;
	@Column(nullable = false)
	private Integer qtdEstoque = 0;
	private Integer qtdAlertaEstoque = 0;
	private String linkYoutube;
	private Boolean alertaQtdeEstoque = Boolean.FALSE;
	private Integer qtdeClique = 0;
}
