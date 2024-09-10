import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;


public class Questao1 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);


        String _nome;
            System.out.println (" Digite o seu nome: ");
            _nome = sc.nextLine();

        int _Ano , anoD;
            System.out.println ("Digite quantos anos voce tem:");
            _Ano = sc.nextInt();
            anoD = _Ano * 365;

        int _Mes , mesD;
        System.out.println ("Digite quantos meses voce tem: ");
        _Mes = sc.nextInt();
        mesD= _Mes / 30   ;


        int _Dia;
            System.out.println ("Digite quantos dias de vida voce tem: ");
            _Dia= sc.nextInt();




        int D;
            D = anoD  + _Dia + mesD ;

            System.out.println (_nome + ", voce tem: " + D + " dias" );

    }
}