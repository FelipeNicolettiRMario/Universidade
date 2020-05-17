package alunos;
import alunos.Alunos;

public class Turma {
	private String curso;
	private Alunos[] quantidadeAlunos = new Alunos[40];
	private String nomeTurma;

	public Turma(String curso,String nomeTurma) {
		this.curso = curso;
		this.nomeTurma = nomeTurma;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getNomeTurma() {
		return nomeTurma;
	}
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	
	public boolean checkMatricula(int matricula) {
		for(Alunos aluno: this.quantidadeAlunos) {
			if(aluno.getMatricula() == matricula) {
				return true;
			}			
		}
		return false;
	}
	
	public boolean insertAluno(Alunos newAluno) {
			
		for(int index = 0;index<=this.quantidadeAlunos.length;index++) {
			if(this.quantidadeAlunos[index] == null) {
					quantidadeAlunos[index] = newAluno;
					return true;
			}
		}
		return false;
	}
	
	public Alunos selectByName(String nameToSearch) {
		for(Alunos aluno: quantidadeAlunos) {
			if(aluno.getNome() == nameToSearch) {
				return aluno;
			}			
		}
		return null;
	}
	
	public Alunos selectById(int matriculaToSearch) {
		for(Alunos aluno: quantidadeAlunos) {
			if(aluno.getMatricula() == matriculaToSearch) {
				return aluno;
			}			
		}
		return null;
	}
	
	public void removeAluno(String toRemove) {
		for(int index = 0;index<=this.quantidadeAlunos.length;index++) {
			if(this.quantidadeAlunos[index] == null) {
				if(quantidadeAlunos[index].getNome() == toRemove) {
					quantidadeAlunos[index] = null;
				}
			}
		}
	}
	
	public void printAlunos() {
		for(Alunos aluno: this.quantidadeAlunos) {
			System.out.println(aluno.getNome());
		}
	}
	
	
	}
	
