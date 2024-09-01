import java.util.Scanner;


public class questao3 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);


        double  porcetagem;
            porcetagem = (double) 1 /100;


       System.out.println ("Digite o seu salario:  ");
        double salarioInformado;
             salarioInformado = sc.nextDouble();


        double salarioReajuste = salarioInformado + (salarioInformado * porcetagem);


            System.out.println(" O seu salario com o reajuste de 1% foi de:  " + salarioReajuste);


    }


}
