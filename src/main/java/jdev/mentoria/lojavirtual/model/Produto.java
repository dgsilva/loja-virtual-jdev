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
	private String tipoUnidade;
	private String nome;
	private Boolean ativo = Boolean.TRUE;
	@Column(columnDefinition = "text", length = 2000)
	private String descricao;
	/*nota item do produto - associar*/
	private Double peso;
	private Double largura;
	private Double altura;
	private Double profundidade;
	private BigDecimal valorVenda = BigDecimal.ZERO;
	private Integer qtdEstoque = 0;
	private Integer qtdAlertaEstoque = 0;
	private String linkYoutube;
	private Boolean alertaQtdeEstoque = Boolean.FALSE;
	private Integer qtdeClique = 0;
}
