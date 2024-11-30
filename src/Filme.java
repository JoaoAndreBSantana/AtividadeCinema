import java.util.Scanner;
public class Filme {

    private String genero;
    private String duracao;
    private String nome;
    private int codigo;



    public Filme(){}

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public int getCodigo(){
        return codigo;

    }

    public void gerenciarFilme() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("DIGITE O NOME DO FILME: ");
        String nome = teclado.nextLine();

        System.out.println("DIGITE O GÊNERO DO FILME: ");
        String genero = teclado.nextLine();

        System.out.println("DIGITE A DURAÇÃO DO FILME: ");
        String duracao = teclado.nextLine();

        System.out.println("DIGITE O CÓDIGO DO FILME: ");
        int codigo = teclado.nextInt();

        setNome(nome);
        setGenero(genero);
        setDuracao(duracao);
        setCodigo(codigo);
    }

    public void apresentarFilme(){

        System.out.println("Nome do filme: " + getNome());
        System.out.println("Genero do filme: " + getGenero());
        System.out.println("Duracao do filme: " + getDuracao());
        System.out.println("Codigo do filme:" + getCodigo());
    }
}