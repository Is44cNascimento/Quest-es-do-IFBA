//import java.util.Scanner;


public class Questao1 {
    public static void main(String[] args) {
           // Scanner sc = new Scanner(System.in);


        String _nome;
            _nome = "Isaac Nascimento de jesus";

        float _Ano;
            _Ano = 19 ;

        float _Dia;
            _Dia= 35;




        float _Mes;
            _Mes= _Dia / 30   ;


        float _Dias;
            _Dias = _Ano * 365 + _Mes ;

            System.out.println ( _nome + " tem " + _Ano + " anos e " + _Mes + "meses =" + _Dias  );

    }
}