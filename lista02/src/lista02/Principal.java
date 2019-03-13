package lista02;

import java.util.List;

/**
 * Essa classe vai servir para a resolu��o da lista 02 de exerc�cios.
 * @author DaviMR
 * @version 1.0
 * @since 12/03/2019
 */
public class Principal {

	/**
	 * Fun��o que da in�cio ao programa.
	 * @param args
	 */
	public static void main (String[] args) {
		

		
	}
	
	/**
	 * Faz a execu��o de tela para mostrar um vetor de inteiros definido pelo usu�rio.
	 */
	public static void mostrarVetor() {
		
		//Pega o tamanho do vetor com o usu�rio
		int tamanhoVet = Console.recuperaInteiro("Quantos elementos ir�o conter dentro do vetor?");
		
		//Executa a fun��o que popula o vetor
		List<Integer> vetor = Exercicios.mostrarVetor(tamanhoVet);
		
		//Printa na tela
		System.out.println(vetor + "\n");
	}
	
	/**
	 * Faz a execu��o de tela para mostrar o maior elemento de um vetor de inteiros definido pelo usu�rio.
	 */
	public static void maiorElementoVetor() {
		
		//Pega o tamanho do vetor com o usu�rio
		int tamanhoVetor = Console.recuperaInteiro("Quantos elementos ir�o conter dentro do vetor?");
		
		//Executa a fun��o que pega o maior elemento
		int maiorElemento = Exercicios.maiorElementoVetor(tamanhoVetor);
		
		//Printa na tela
		System.out.println("O maior elemento do vetor � " + maiorElemento + "\n");
	}
	
	/**
	 * Faz a execu��o de tela para mostrar o menor elemento e sua posi��o em um vetor definido pelo usu�rio.
	 */
	public static void menorElemento() {
		
		//Pega o tamanho do vetor com o usu�rio
		int tamanhoVeto = Console.recuperaInteiro("Quantos elementos ir�o conter dentro do vetor?");
		
		//Executa a fun��o que pega o menor elemento do vetor e sua posi��o.
		int posicaoElemento[] = Exercicios.menorElemento(tamanhoVeto);
		
		//Printa na tela
		System.out.println("O menor elemento � o " + posicaoElemento[0] + "e sua posi��o no vetor � " + posicaoElemento[1]);
	}
	
}
