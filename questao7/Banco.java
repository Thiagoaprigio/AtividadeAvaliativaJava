package questao7;
    public class Banco {
  
    private static final double TAXA_POSITIVA = 0.02;
     private static final double TAXA_NEGATIVA = 0.05;

    // Método estático para calcular a taxa de juros com base no saldo
    public static double calculaTaxaJuros(double saldo) {
      if (saldo >= 0) {
          return saldo * TAXA_POSITIVA;
        } else {
            return saldo * TAXA_NEGATIVA;
        }
    }

    public static void main(String[] args) {
       double saldoPositivo = 1000.0;
        double saldoNegativo = -500.0;

         double taxaPositiva = Banco.calculaTaxaJuros(saldoPositivo);
            double taxaNegativa = Banco.calculaTaxaJuros(saldoNegativo);

          System.out.println("Taxa de juros para saldo positivo: " + taxaPositiva);
        System.out.println("Taxa de juros para saldo negativo: " + taxaNegativa);
    }
}