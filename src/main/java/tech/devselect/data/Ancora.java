package tech.devselect.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ancora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ancora", updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Endereco endereco;
	
	@Column(length = 100, nullable = false)
	private String email;
	
	@Column(nullable = false, length = 13)
	private String telefone;
	
	
}
