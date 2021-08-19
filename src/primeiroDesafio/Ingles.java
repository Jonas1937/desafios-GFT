package primeiroDesafio;

public class Ingles extends Idioma {

	{nomeDoIdioma = "Ingles";}

	@Override
	public void saudacao() {
		System.out.println("Idioma:" + nomeDoIdioma);
		System.out.println("Hello World");
	}

}
