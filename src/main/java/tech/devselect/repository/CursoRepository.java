package tech.devselect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.devselect.data.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
