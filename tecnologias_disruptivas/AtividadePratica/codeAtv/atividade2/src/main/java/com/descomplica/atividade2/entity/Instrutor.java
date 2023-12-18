package com.descomplica.atividade2.entity;
// ENTITY INSTRUTOR
// Imports
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Instrutor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idInstrutor;
	private Integer rg;
	private String nome;
	private Date nascimento;
	private Integer titulacao;
	
	
	@OneToMany(mappedBy = "instrutor")
	private List<Turma> turmas;
	
	// Getters e Setters
	public Integer getIdInstrutor() {
	return idInstrutor;
	}	
	
public void setIdInstrutor(Integer idInstrutor) {
	this.idInstrutor = idInstrutor;
	  }

public Integer getRg() {
	return rg;
	  }

public void setRg(Integer rg) {
	this.rg = rg;
	}

public String getNome() {
	return nome;
	}

public void setNome(String nome) {
	this.nome = nome;
	}

public Date getNascimento() {
	return nascimento;
	}

public void setNascimento(Date nascimento) {
	this.nascimento = nascimento;
	}

public Integer getTitulacao() { 
	return titulacao;
	}

public void setTitulacao(Integer titulacao) {
	this.titulacao = titulacao;
	}

public List<Turma> getTurmas() {
	return turmas;
	}

public void setTurmas(List<Turma> turmas) {
	this.turmas = turmas;
	}
	
}
