import java.util.Scanner;



public class questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int numeroDigitado;
        System.out.println("Digite um valor:");
        numeroDigitado = sc.nextInt();


        int sucessor;
        sucessor = (numeroDigitado + 1);
        System.out.println ("O sucessor foi: " +  sucessor);




        int antecessor;
        antecessor = (numeroDigitado - 1);
        System.out.println ("O antecessor foi: " +  antecessor);



    }
}