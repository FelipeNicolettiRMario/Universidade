package testes;

import alunos.Alunos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlunosTest {
	Alunos newAluno = new Alunos(1,"Felipe","BD");
	@Test
	void testName() {
		String name = "Felipe";
		String resultName = newAluno.getNome();
		assertEquals(name,resultName);
	}
	@Test
	void testMatricula() {
		int matricula = 1;
		int resultName = newAluno.getMatricula();
		assertEquals(matricula,resultName);
	}
	
	@Test
	void testCurso() {
		String curso = "BD";
		String resultName = newAluno.getCurso();
		assertEquals(curso,resultName);
	}
	
}
