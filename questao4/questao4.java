import java.util.Scanner;


public class questao4 {

    public static void main(String [] args ){

        Scanner sc = new Scanner (System.in) ;


        String Chocolate = "chocolate";
        String Salgado = "Salgado";

        double codigoUm;
            System.out.println ("Digite o código do produto um: ");
        codigoUm = sc.nextDouble();
        {

            if (codigoUm == 01) {
                if ( 01 == codigoUm ) {
                    System.out.println(Chocolate + " selecionado");
                } else {
                    System.out.println("Produto desconhecido");
                }
            }


            if (codigoUm == 02) {
                if (  02 == codigoUm ){
                    System.out.println(Salgado + " selecionado");
                } else {
                    System.out.println ("Produto desconhecido ");
                }
            }
        }

        double valorUm;
        System.out.println ("Digite o valor um:");
         valorUm = sc.nextDouble();


        int quantidadeUm;
             System.out.println ("Digite a quantidade do produto um: ");
         quantidadeUm= sc.nextInt();



        Scanner sc2 = new Scanner (System.in);

        double codigoDois;
        System.out.println ("Digite o código do produto dois: ");
        codigoDois = sc2.nextDouble();
        {

            if (codigoDois == 01) {
                if ( 01 == codigoUm ) {
                    System.out.println(Chocolate + " selecionado");
                } else {
                    System.out.println("Produto desconhecido");
                }
            }


            if (codigoDois == 02) {
                if (  02 == codigoDois ){
                    System.out.println( Salgado + " selecionado");
                } else {
                    System.out.println ("Produto desconhecido ");
                }
            }
        }


        double valorDois;
            System.out.println ("Digite o valor do produto dois: ");
         valorDois = sc2.nextDouble();



        int quantidadeDois;
                System.out.println("Digite a quantidade do produto dois:");
            quantidadeDois = sc2.nextInt();



        double IPIimput;

        System.out.println ("Digite o valor do IPI");
        IPIimput = sc.nextDouble();
        Double IPI = (IPIimput / 100) + 1 ;




        System.out.println ("Carregando.");
        System.out.println ("Carregando..");
        System.out.println ("Carregando...");


        double valorDosProdutos;
                valorDosProdutos = ((valorUm * quantidadeDois) + (valorDois * quantidadeDois) * IPI);


                System.out.println ("O total da sua compra foi de: R$" + valorDosProdutos);



    }
}
