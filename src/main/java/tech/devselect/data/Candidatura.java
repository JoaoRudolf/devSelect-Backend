package tech.devselect.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Candidatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_candidatura", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "cand_ant")
	private int candidaturasAnteriores;
	
	@Column(name = "nt_lg")
	private int notaProvaLogica;
	
	@Column(name = "en_lvl")
	private int nivelIngles;
	
	@Column(name = "nt_atv_grup")
	private int notaAtividadeEmGrupo;
	
	@JoinColumn(name = "curso_id", nullable = false)
	@ManyToOne
	private Curso curso;
	
	@JoinColumn(name = "pessoa_id", nullable = false)
	@ManyToOne
	private Pessoa candidato;

}
