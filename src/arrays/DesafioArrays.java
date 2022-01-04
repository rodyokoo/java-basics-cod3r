package arrays;

import java.util.Scanner;

public class DesafioArrays {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número de notas a serem computadas: ");

		int numeroDeNotas = entrada.nextInt();

		double notas[] = new double[numeroDeNotas];

		double somatorio = 0.0;

		for (int i = 0; i < numeroDeNotas; i++) {
			System.out.printf("Digite a %dª nota:\n", i + 1);
			notas[i] = entrada.nextDouble();
		}

		for (double nota : notas) {
			somatorio += nota;
		}

		double media = somatorio / numeroDeNotas;

		System.out.printf("A média das notas é %.1f.", media);

		entrada.close();
	}
}
