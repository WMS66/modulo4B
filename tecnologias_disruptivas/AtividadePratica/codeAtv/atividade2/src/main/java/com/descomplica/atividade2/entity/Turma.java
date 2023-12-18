package com.descomplica.atividade2.entity;
// ENTITY TURMA
// Imports
import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Turma {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long idTurma;

	  private Time horario;
	  private Integer duracao;
	  private Date dataInicio;
	  private Date dataFim;

	  @ManyToOne
	  @JoinColumn(name = "instrutor_id")
	  private Instrutor instrutor;

	  // Getters e Setters
	  public Long getIdTurma() {
	    return idTurma;
	  }

	  public void setIdTurma(Long idTurma) {
	    this.idTurma = idTurma;
	  }

	  public Time getHorario() {
	    return horario;
	  }

	  public void setHorario(Time horario) {
	    this.horario = horario;
	  }

	  public Integer getDuracao() {
	    return duracao;
	  }

	  public void setDuracao(Integer duracao) {
	    this.duracao = duracao;
	  }

	  public Date getDataInicio() {
	    return dataInicio;
	  }

	  public void setDataInicio(Date dataInicio) {
	    this.dataInicio = dataInicio;
	  }

	  public Date getDataFim() {
	    return dataFim;
	  }

	  public void setDataFim(Date dataFim) {
	    this.dataFim = dataFim;
	  }

	  public Instrutor getInstrutor() {
	    return instrutor;
	  }

	  public void setInstrutor(Instrutor instrutor) {
	    this.instrutor = instrutor;
	  }
	}

