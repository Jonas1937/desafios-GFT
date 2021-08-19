package quartoDesafio;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int firstNumber = scan.nextInt();
        System.out.println("Digite mais um numero");
        int secondNumber = scan.nextInt();


        int nota = firstNumber;
        String resultado = "";
        for(int i = firstNumber; i <= secondNumber; i++){
            if(nota > 6){
                nota = 0;
            }
            resultado = resultado + " " + retornaNota(nota);
            nota++;
        }



        System.out.println("Suas notas:");
        System.out.println(resultado);


    }

    public static String retornaNota(int numero){
        switch(numero){
            case 0:
                return "Do";
            case 1:
                return "Re";
            case 2:
                return "Mi";
            case 3:
                return "Fa";
            case 4:
                return "Sol";
            case 5: 
                return "La";
            case 6:
                return "Si";
        }

        return "";
    }
}
