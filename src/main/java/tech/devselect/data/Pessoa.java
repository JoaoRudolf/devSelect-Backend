package tech.devselect.data;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pessoa", updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private Endereco endereco;
	
	@Column(length = 100, nullable = false)
	private String email;
	
	@Column(nullable = false, length = 13)
	private String telefone;
	
	@Column(name = "dt_nascim")
	private LocalDate dataNascimento;
}
