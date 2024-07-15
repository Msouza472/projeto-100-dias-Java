public class Conta {
    private double saldo;
    private int numeroConta;

    public Conta(double saldo, int numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void consultarSaldo() {
        System.out.printf("Saldo da conta %d: R$%.2f\n", numeroConta, saldo);
    }

    public void fazerDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito realizado no valor de R$%.2f\n", valor);
            System.out.printf("Saldo atual: R$%.2f\n", saldo);
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    public void fazerSaque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque realizado no valor de R$%.2f\n", valor);
            System.out.printf("Saldo atual: R$%.2f\n", saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido");
        }
    }

    public void transferirPara(Conta destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.saldo += valor;
            System.out.printf("Transferência de R$%.2f da conta %d para a conta %d realizada com sucesso.\n", valor, numeroConta, destino.numeroConta);
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }
}
