import java.util.Scanner;

public class Sala {

    int capacidade;
    String cod;


    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Sala(){}

    public String getCod() {
        return cod;
    }

    public int getCapacidade() {
        return capacidade;
    }



    public void apresentarSala(){

        System.out.println("Capacidade da Sala: " + getCapacidade());
        System.out.println("Código da Sala: " +getCod());

    }

    public void gerenciarSala() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("DIGITE A CAPACIDADE DA SALA: ");
        int capacidade = teclado.nextInt();
        teclado.nextLine();  // Limpar o buffer

        System.out.println("DIGITE O CÓDIGO DA SALA: ");
        String cod = teclado.nextLine();

        setCapacidade(capacidade);
        setCod(cod);
    }

}

   