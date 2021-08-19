package terceiroDesafio;

public class Cachorro extends Animal {

    public Cachorro(String nome, int peso) {
        super(nome,peso);
    }
   
    @Override
    public String som(){
        return "AuAu";
    };

    @Override
    public int quantidadeRacao(){
        if(peso <= 3){
            return 35*peso;
        }
        if(peso > 3 & peso <= 10){
            return 45*peso;
        }
        if(peso > 10){
            return 50*peso;
        }
        return 0;
    };
}
