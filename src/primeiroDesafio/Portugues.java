package primeiroDesafio;

public class Portugues extends Idioma {

	{nomeDoIdioma = "Portugues";}

	@Override
	public void saudacao() {
		System.out.println("Idioma:" + nomeDoIdioma);
		System.out.println("Ola Mundo");
	}

}
