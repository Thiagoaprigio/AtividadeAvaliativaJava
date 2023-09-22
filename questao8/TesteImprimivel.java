package questao8;

interface Imprimivel {
    void imprimir();
}
//Dsj
class Documento implements Imprimivel {
    private String conteudo;

    public Documento(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Documento:\n" + conteudo);
    }
}
// passou %9
class Foto implements Imprimivel {
    private String descricao;

    public Foto(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Foto:\n" + descricao);
    }
}

public class TesteImprimivel {
    public static void main(String[] args) {
        Documento documento = new Documento("Este é um documento de texto.");
        Foto foto = new Foto("Uma foto de um lindo pôr do sol.");

        documento.imprimir();
        foto.imprimir();
    }
}