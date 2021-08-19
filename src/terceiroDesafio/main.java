package terceiroDesafio;

public class main {
    public static void main(String[] args){
        Gato coca = new Gato("Coca", 20);
        Gato foxy = new Gato("Foxy", 3);
        Cachorro einstein = new Cachorro("Einstein",10);
        Gato edward = new Gato("Edward", 5);
        
        int totalRacao = coca.quantidadeRacao() + foxy.quantidadeRacao() + einstein.quantidadeRacao() + edward.quantidadeRacao();
        System.out.println(totalRacao);
    }
}
