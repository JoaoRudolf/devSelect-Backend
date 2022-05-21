package tech.devselect.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Programa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_programa", updatable = false, nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@JoinColumn(name = "ancora_id", nullable = false)
	@ManyToOne
	private Ancora ancora;
	
	

}
