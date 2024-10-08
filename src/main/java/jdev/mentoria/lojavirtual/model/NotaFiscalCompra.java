package jdev.mentoria.lojavirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@Entity
@Table(name = "nota_fiscal_compra")
@SequenceGenerator(name = "seq_nota_fiscal_compra", sequenceName = "seq_nota_fiscal_compra", allocationSize = 1, initialValue = 1)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class NotaFiscalCompra implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota_fiscal_compra")
	private Long id;
	@Column(nullable = false)
	private String numeroNota;
	@Column(nullable = false)
	private String serieNota;
	private String descricaoObs;
	@Column(nullable = false)
	private BigDecimal valorTotal;
	private BigDecimal valorDesconto;
	@Column(nullable = false)
	private BigDecimal valorIcms;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataCompra;
	
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
	private Pessoa pessoa;
	@ManyToOne
	@JoinColumn(name = "conta_pagar_id", nullable = false,
	foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "conta_pagar_fk"))
	private ContaPagar contaPagar;
}
