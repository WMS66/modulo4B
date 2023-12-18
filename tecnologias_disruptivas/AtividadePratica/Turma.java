@Entity
@Table(name="turma")

public class Turma{

@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)

@Column(name = "turma_id")

private Integer turmaId;

@Column(name = "turma_nome")

private String turmaNome;

@OneToOne

@JoinColumn(name = "instrId", referencedColumnName = "instrutorid")

private Instrutor instrtutor;

public Integer getTurmaId() {

return turmaId;

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
