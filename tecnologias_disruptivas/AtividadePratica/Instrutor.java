@Entity
@Table(name="instrutor")

public class Instrutor{

@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)

@Column(name = "instrutor_id")
private Integer instrutorId;

@Column(name = "instrutor_nome")

private String instrutorNome;

@OneToOne

@JoinColumn(name = "turmaId", referencedColumnName = "turma_id")
private Turma turma;

public Integer getInstrutorId() {

return instrutorId;
}

public void setInstrutorId(Integer instrutorIs) {
this.InstrutorIs = instrutorIs;

}

public Integer getInstrutorRG() {

return InstrutorRG;

public void setInstrutorRG(String instrutorRG) {
this.InstrutorRG = instrutorRG;

}

public String getInstrutorNome() (

return InstrutorNome;

}

public void setInstrutorNome(String InstrutorNome) {

this.InstrutorNome = InstrutorNome;

}

public Date InstrutorNasc() (

return InstrutorNasc;

}

public void setInstrutorNasc(Date InstrutorNasc) {

this.InstrutorNasc = InstrutorNasc;

}

public Integer setInstrutorTit() (

return InstrutorTit;

}

public void setInstrutorTit(Integer InstrutorTit) {

this.InstrutorTit = InstrutorTit;

}

}
