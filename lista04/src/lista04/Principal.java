package lista04;

import java.util.ArrayList;

/**
 * Classe principal de execução
 * 
 * @author DaviMR
 *
 */
public class Principal {
	
	/**
	 * Método que da início ao programa.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Livro livro01 = new Livro();
		livro01.setCodigo("1598FHK");
		livro01.setTitulo("Core Java 2");
		
		ArrayList<String> autoresLivro01 = new ArrayList<>();
		autoresLivro01.add("Cay S. Horstmann");
		autoresLivro01.add("Gary Cornell");
		
		livro01.setAutores(autoresLivro01);
		livro01.setIsbn("0130819336");
		livro01.setAno(1999);
		
		Livro livro02 = new Livro();
		livro02.setCodigo("9865PLO");
		livro02.setTitulo("Java, How to Program");
		
		ArrayList<String> autoresLivro02 = new ArrayList<>();
		autoresLivro02.add("Harvey Deitel");
		
		livro02.setAutores(autoresLivro02);
		livro02.setIsbn("0130341517");
		livro02.setAno(1999);
		
		
		
	}

}
