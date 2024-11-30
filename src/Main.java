import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int condicao;
        int op;
       Sala sala1= new Sala();
        Filme filme1= new Filme();

        System.out.println("--SISTEMA DE CINEMA--");
        System.out.println("----------------------");
        while(true){
            System.out.println("ESCOLHAS:\n------------------\nGERENCIAR SALA(1)");
            System.out.println("SAIR(2)");
            condicao = entrada.nextInt();


            if(condicao==1){
                sala1.gerenciarSala();
                filme1.gerenciarFilme();
                System.out.println("DESEJA APRESENTAR INFORMAÇÕES CADASTRADAS?\nsim(1)\nnao(2)");
                op= entrada.nextInt();
                switch (op) {
                    case 1:
                       sala1.apresentarSala();
                       filme1.apresentarFilme();
                        break;
                    case 2:
                        System.out.println("voltando para escolhas");

                        break;

                    default:
                        System.out.println("incorreto");

                        break;
                }
            }else if (condicao==2){
                System.out.println("saindo...");
                break;
            }else{
                System.out.println("incorreto");
            }

        }
    }
}