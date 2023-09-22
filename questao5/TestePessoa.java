package questao5;
//
class Pessoa {
    private String nome;
    protected int idade;
    //teste ok
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

 class Estudante extends Pessoa {
    public Estudante(String nome, int idade) {
        super(nome, idade);
    }

  
}

public class TestePessoa {  
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Alice", 20);
///
        System.out.println("Nome do estudante: " + estudante.getNome());
        System.out.println("Idade do estudante: " + estudante.idade);
    }
}
