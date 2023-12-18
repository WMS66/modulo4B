@Entity

@Table(name="instrutor")

public class Instrutor{

@ld

@GeneratedValue(strategy =GenerationType.IDENTITY)

@Column(name = "instr_id")

private Integer instrld;



@Column(name = "instr_nome")

private String instrNome;



@OneToOne

@JoinColumn(name = "turmaId", referencedColumnName = "turma_id")

private Turma turma;



public Integer getInstrld() {

return instrld;

}

public void setInstrId(Integer instrIs) {

this.instrIs = instrIs;

}



public Integer getInstrRG() {

return InstrRG;



public void setInstrRG(String instrRG) {

this.instrRG = instrRG;

}



public String getInstrNome() (

return InstrNome;

}



public void setInstrNome(String InstrNome) {

this.InstrNome = InstrNome;

}

public Date InstrNasc() (

return InstrNasc;

}



public void setInstrNasc(Date InstrNasc) {

this.InstrNasc = InstrNasc;

}

public Integer setInstrTit() (

return InstrTit;

}



public void setInstrTit(Integer InstrTit) {

this.InstrTit = InstrTit;

}

}



@Entity

@Table(name="turma")

public class Turma{

@ld

@GeneratedValue(strategy =GenerationType.IDENTITY)

@Column(name = "turma_id")

private Integer turmald;



@Column(name = "turma_nome")

private String turmaNome;



@OneToOne

@JoinColumn(name = "instrId", referencedColumnName = "instrid")

private Instr instr;



public Integer getTurmald() {

return turmald;

}

public void setTurmaId(Integer turmaId) {

this.turmaId = turmaId;

}



public Time gethorarioTurma() {

return horarioTurma;

}

public void sethorarioTurma(Time horarioTurma) {

this.horarioTurma = horarioTurma;

}



public Integer getDuracaoTurma() (

return duracaoTurma;

}



public void setDuracaoTurma(Integer duracaoTurma) {

this.duracaoTurma = duracaoTurma;

}

public Date dataInicioTurma() (

return dataInicioTurma;

}



public void setDataInicioTurma(Date dataInicioTurma) {

this.dataInicioTurma = dataInicioTurma;

}

public Integer setDataFimTurma() (

return dataFimTurma;

}



public void setDataFimTurma(Date dataFimTurma) {

this.dataFimTurma = dataFimTurma;

}

}
