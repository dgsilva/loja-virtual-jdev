package jdev.mentoria.lojavirtual.model;

import org.springframework.security.core.GrantedAuthority;

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
@Table(name = "acesso")
@SequenceGenerator(name = "seq_acesso", sequenceName = "seq_acesso", initialValue = 1, allocationSize = 1)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Acesso implements GrantedAuthority {

	private static final long serialVersionUID = 1L;

	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso")
	private Long id;
	
	@Column(nullable = false)
	private String descricao; /*Acesso ex: ROLE_ADMIN ou ROLE_SECRETARIO*/
	
	
	@Override
	public String getAuthority() {
		return this.descricao;
	}

}
