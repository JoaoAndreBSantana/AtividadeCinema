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

    /*public void gerenciarfilme(Filme filme){
        Scanner teclado = new Scanner(System.in);


        System.out.println("DIGITE O NOME DO FILME ");
        String nome= teclado.nextLine();

        System.out.println("DIGITE O GENERO DO FILME ");
        String genero= teclado.nextLine();

        System.out.println("DIGITE A DURACAO DO FILME ");
        String duracao= teclado.nextLine();

        System.out.println("DIGITE O CODIGO DO FILME ");
        int codigo= teclado.nextInt();

        filme.setNome(nome);
        filme.setGenero(genero);
        filme.setDuracao(duracao);
        filme.setCodigo(codigo);

    }*/

    public void ApresentarFilmeSala(Filme filme, Sala sala){

        System.out.println("Capacidade da Sala: " + sala.getCapacidade());
        System.out.println("Código da Sala: " +getCod());
        System.out.println("Nome do filme: " + filme.getNome());
        System.out.println("Genero do filme: " + filme.getGenero());
        System.out.println("Duracao do filme: " + filme.getDuracao());
        System.out.println("Codigo do filme:" + filme.getCodigo());
    }
    public void gerenciarSalaFilme(Filme filme, Sala sala){
        Scanner teclado = new Scanner(System.in);


        System.out.println("DIGITE A CAPACIDADE DA SALA: ");
        int capacidade= teclado.nextInt();
        teclado.nextLine();
        System.out.println("DIGITE O CÓDIGO DA SALA:  ");
        String cod= teclado.nextLine();

    sala.setCod(cod);
    sala.setCapacidade(capacidade);


        System.out.println("DIGITE O NOME DO FILME ");
        String nome= teclado.nextLine();

        System.out.println("DIGITE O GENERO DO FILME ");
        String genero= teclado.nextLine();

        System.out.println("DIGITE A DURACAO DO FILME ");
        String duracao= teclado.nextLine();

        System.out.println("DIGITE O CODIGO DO FILME ");
        int codigo= teclado.nextInt();

        filme.setNome(nome);
        filme.setGenero(genero);
        filme.setDuracao(duracao);
        filme.setCodigo(codigo);

    }


}

   