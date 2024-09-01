import java.util.Scanner;


public class questao5 {

    public static void main ( String [] args){
        Scanner sc = new Scanner (System.in);


        double _1SM;
            System.out.println ("Digite o valor do salario minimo:");
        _1SM = sc.nextDouble ();





        double quantidadeSM;
                    System.out.println ("Digite a quantidade de salarios recebido: ");
            quantidadeSM = sc.nextDouble();


            double salarioResultado;
                salarioResultado = (_1SM * quantidadeSM);
                    System.out.println ("O salario total recebido foi de: R$" + salarioResultado );









    }

}
