package alunos;
import alunos.Prova;

public class Alunos {
	private int matricula;
	private String nome;
	private String curso;
	private Prova[] provas = new Prova[4];
	

	public Alunos(int matricula,String nome,String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public Prova[] getProvas() {
		return provas;
	}

	public void setProvas(Prova[] provas) {
		this.provas = provas;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
