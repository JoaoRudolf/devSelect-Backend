package tech.devselect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.devselect.data.Candidatura;

public interface CandidaturaRepository  extends JpaRepository<Candidatura, Long> {

}
