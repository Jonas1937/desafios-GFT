package primeiroDesafio;

public class main {
    public static void main(String[] args){
        Hungaro hungaro = new Hungaro();
        Ingles ingles = new Ingles();
        Portugues portugues = new Portugues();
        Tcheco  tcheco = new Tcheco();

        ingles.saudacao();
        System.out.println("---------------");
        hungaro.saudacao();
        System.out.println("---------------");
        portugues.saudacao();
        System.out.println("---------------");
        tcheco.saudacao();
    }
}
