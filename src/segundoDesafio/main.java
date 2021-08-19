package segundoDesafio;

public class main {
    public static void main(String[] args){

        int anoDeEntrada = 0;

        System.out.println(processaPresente(anoDeEntrada));

    }

    private  static String processaPresente(int anoEntrada){

        int anoConsiderado = 2021;
        int anoProcessado = anoConsiderado - anoEntrada;
        switch(anoProcessado){
            case 15:
                return "Vale Jantar top";
            case 10:
                return "Vale Jantar";
            case 5:
                return "Fone Bluetooth";
            case 2:
                return "Smart Watch";
            case 1:
                return "Vale Presente";
            default: 
                return "Esse ano não vai ter presente";
        }
    }
}
