package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 5.4);
		Aluno a2 = new Aluno("Gui", 8.4);
		Aluno a3 = new Aluno("Rafa", 10.0);
		Aluno a4 = new Aluno("Caio", 2.5);
		Aluno a5 = new Aluno("Clara", 7.0);
		Aluno a6 = new Aluno("Becca", 6.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a-> a.getNota() >= 7.0;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.getNome() + "! Você foi aprovado(a)!";
		
		alunos.stream().filter(aprovado).map(saudacaoAprovado).forEach(System.out::println);
	}
}
