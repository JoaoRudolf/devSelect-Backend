package tech.devselect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.devselect.data.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
