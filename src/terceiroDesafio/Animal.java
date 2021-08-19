package terceiroDesafio;

public abstract class Animal {
    String nome;
    int peso;

    Animal(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
    }

    protected abstract String som();

    protected abstract int quantidadeRacao();

}
