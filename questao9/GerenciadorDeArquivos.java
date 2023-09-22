package questao9;

public class GerenciadorDeArquivos {
  /// teste!!!!!
    public static void lerArquivo(String nomeArquivo) {
        System.out.println("Lendo o arquivo: " + nomeArquivo);
        System.out.println("Conteúdo do arquivo:");
        System.out.println("Este é o conteúdo do arquivo " + nomeArquivo);
    }

    public static void main(String[] args) {
        String nomeArquivo = "exemplo.txt"; // Nome do arquivo a ser lido
        GerenciadorDeArquivos.lerArquivo(nomeArquivo);
    }
}
