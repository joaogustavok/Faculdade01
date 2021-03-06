package pooRoberto.Aula5.ExerciciosFixacao;

public class Departamento {
    private int codigo;
    private String nome;
    public void imprimir() {
        System.out.println("Código: "+this.codigo);
        System.out.println("Nome: "+this.nome);
    }

    //Construtor cheio
    public Departamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Construtor vazio
    public Departamento() {
        this.codigo = 0;
        this.nome = "";

    }
}
