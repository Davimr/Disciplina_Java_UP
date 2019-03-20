package lista02;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para executar os exercícios da lista 02.
 * @author DaviMR
 */
public class Exercicios {
	
	/**
	 * Ex01 . Função que popula o vetor de acordo com a escolha do usuário.
	 * @param tamanhoVet - Tamanho do vetor que o usuário predefiniu anteriormente.
	 * @return - Vetor já populado pelo usuário.
	 */
	public static List<Integer>mostrarVetor (int tamanhoVet) {
		
		List<Integer> vetor = new ArrayList<>();
		
		int i = 0;
		
		for (i = 0; i < tamanhoVet; i ++) {
			
			int x = Console.recuperaInteiro("Digite o valor para posição " + (i+1) );
			vetor.add(x);
		}
		
		return vetor;
	}
	
	/**
	 * Ex02 . Função que retorna o valor do maior elemento dentro de um vetor de inteiros definido pelo usuário.
	 * @param tamanhoVetor - Tamanho do vetor que o usuário predefiniu anteriormente.
	 * @return - Maior elemento do vetor.
	 */
	public static int maiorElementoVetor (int tamanhoVetor) {
		
		int i = 0;
		
		int contador = 0;
		
		for (i = 0; i < tamanhoVetor; i ++) {
			
			int x = Console.recuperaInteiro("Digite o valor para posição " + (i+1) );
			
			if (x > contador ) {
			
				contador = x;
			}
		}
		
		return contador;
	}
	
	/**
	 * Ex03 . Função que retorna o menor elemento e sua posição em um vetor definido pelo usuário.
	 * @param tamanhoVeto - Tamanho do vetor que o usuário predefiniu anteriormente.
	 * @return - Menor elemento e sua posição no vetor.
	 */
	public static int[] menorElemento(int tamanhoVeto) {
		
		int i = 0;
		
		int contador = 1000000;
		
		int posicao = 0;
		
		int posicaoElemento [] = new int [2];
		
		for (i = 0; i < tamanhoVeto; i ++) {
			
			int x = Console.recuperaInteiro("Digite o valor para posição " + (i+1));
			
			posicao = posicao + 1;
			
			if (x < contador) {
				
				posicaoElemento[0] = x;
				
				posicaoElemento[1] = posicao;
				
				contador = x;
			}
		}
		
		return posicaoElemento;
	}

}
