package tech.devselect.data;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curso", updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Endereco endereco;
	
	@Column(name = "dt_inicio")
	private LocalDate dataInicio;
	
	@Column(name = "dt_fim")
	private LocalDate dataFim;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Periodo periodo;
	
	@JoinColumn(name = "programa_id", nullable = false)
	@ManyToOne
	private Programa programa;
	
	

}
