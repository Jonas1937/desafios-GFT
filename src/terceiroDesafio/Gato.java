package terceiroDesafio;
public class Gato extends Animal {

    public Gato(String nome, int peso) {
        super(nome,peso);
    }
   
    @Override
    public String som(){
        return "Miau";
    };

    @Override
    public int quantidadeRacao(){
        if(peso <= 4){
            return 12*peso;
        }
        if(peso > 4){
            return 15*peso;
        }
        return 0;
    };
}
