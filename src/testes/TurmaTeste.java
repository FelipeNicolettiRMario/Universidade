package testes;

import alunos.Alunos;
import alunos.Turma;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TurmaTeste {
	Turma turmaTeste = new Turma("Banco de dados","2 Semestre");
	
	@Test
	void testTurma() {
		String curso = "Banco de dados";
		String resultName = turmaTeste.getCurso();
		assertEquals(curso,resultName);
	}
	@Test
	void testNome() {
		String nome = "2 Semestre";
		String resultName = turmaTeste.getNomeTurma();
		assertEquals(nome,resultName);
	}
	
	Alunos alunoInsert = new Alunos(1,"Ana","Banco de dados");
	Turma newTurma = new Turma("BD","1 Sem");
	
	@Test
	void insereAluno() {
		boolean check = true;
		boolean testClass = newTurma.insertAluno(alunoInsert);
		assertEquals(check,testClass);
	}
	
	@Test
	void checkMatricula() {
		boolean check = true;
		boolean testClass = newTurma.checkMatricula(alunoInsert.getMatricula());
		System.out.println(testClass);
		assertEquals(check,testClass);
	}
	@Test
	void selectByName() {
		boolean testClass = newTurma.insertAluno(alunoInsert);
		Alunos result = newTurma.selectByName(alunoInsert.getNome());
		assertEquals(alunoInsert,result);
	}
	@Test
	void selectByMatricula() {
		boolean testClass = newTurma.insertAluno(alunoInsert);
		Alunos result = newTurma.selectById(alunoInsert.getMatricula());
		assertEquals(alunoInsert,result);
	}
	
}
