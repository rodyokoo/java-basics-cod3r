package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Rodrigo");
		Aluno aluno2 = new Aluno("Paulo");
		Aluno aluno3 = new Aluno("Ronaldo");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web Completo");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome);
			System.out.println("O meu nome é: " + aluno.nome);
		}
		
		System.out.println("Usando o get: " + aluno1.cursos.get(0));
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
