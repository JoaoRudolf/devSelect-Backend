package tech.devselect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.devselect.data.dto.PessoaDTO;
import tech.devselect.service.PessoaService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaService pessoaTesteService;
	
	@GetMapping
	public List<PessoaDTO> getAll() {
		return pessoaTesteService.getAll();
	}
	
	@PostMapping
	public ResponseEntity<PessoaDTO> save(@RequestBody PessoaDTO pessoa) {
		return new ResponseEntity<PessoaDTO>(pessoaTesteService.save(pessoa), HttpStatus.CREATED);
	}

}
