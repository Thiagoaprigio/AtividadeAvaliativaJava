package questao3;


public class ContaBancaria {
    private double saldo;

    
    public ContaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("Erro: Saldo inicial não pode ser negativo.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Valor do depósito deve ser maior que zero.");
        }
    }
                // tdu  ok 
    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Erro: Saldo insuficiente para o saque.");
            }
        } else {
            System.out.println("Erro: Valor do saque deve ser maior que zero.");
        }
    }
///// get ta 100% 
    
    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0); // Salario ja inicia com 1000.0

        conta.depositar(500.0);
        conta.sacar(200.0);  

        System.out.println("Saldo atual: " + conta.getSaldo()); 
    }
}