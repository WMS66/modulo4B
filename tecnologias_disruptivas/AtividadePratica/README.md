1º Codigo Entidade 'Instrutor'

import javax.persistence.*;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
public class Instrutor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idInstrutor;
  private Integer rg;
  private String nome;
  private Date nascimento;
  private Integer titulacao;

  @OneToMany(mappedBy = "instrutor")
  private List<Turma> turmas;

  // Getters e Setters
  public Long getIdInstrutor() {
    return idInstrutor;
  }

  public void setIdInstrutor(Long idInstrutor) {
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
A anotação @Entity indica que a classe Instrutor é uma entidade JPA e está associada a uma tabela no banco de dados. A anotação @Table é usada para especificar o nome da tabela no banco de dados.

A anotação @Column é usada para especificar o nome da coluna no banco de dados para cada atributo da classe. Isso ajuda a mapear os atributos da classe para as colunas correspondentes no banco de dados.

A anotação @OneToMany é usada para definir o relacionamento "one-to-many" com a classe Turma. A opção mappedBy indica o nome do atributo na classe Turma que mantém o relacionamento e a opção cascade especifica que as operações de persistência devem ser cascata para as turmas associadas.

2º Codigo Entidade 'turma'

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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

A anotação @Entity é usada para marcar a classe Turma como uma entidade JPA, indicando que ela está associada a uma tabela no banco de dados.

A anotação @Table é usada para especificar o nome da tabela no banco de dados para a entidade Turma.

As anotações @Column são usadas para mapear os atributos da classe para colunas específicas no banco de dados, definindo os nomes das colunas correspondentes.

A anotação @Id é usada para marcar o atributo idTurma como a chave primária da tabela.

A anotação @GeneratedValue é usada para especificar a estratégia de geração de valores para a chave primária.

A anotação @ManyToOne é usada para definir o relacionamento "many-to-one" entre a tabela Turma e Instrutor.

A anotação @JoinColumn é usada para criar uma coluna no banco de dados chamada "instrutor_id" para representar o relacionamento com a tabela Instrutor.



Essas anotações são usadas para configurar o mapeamento objeto-relacional (ORM) entre a classe Turma e a tabela correspondente no banco de dados, permitindo que você armazene e recupere dados da tabela usando objetos da classe Turma.
