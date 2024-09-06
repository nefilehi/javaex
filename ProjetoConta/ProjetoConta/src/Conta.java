public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String cliente;

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
    return false;
    }
    public void depositar(double valor) {
        saldo += valor;

    }
    public void imprimir() {
        System.out.println("Cliente = " + cliente);
        System.out.println("Conta = " + conta);
        System.out.println("Agência = " + agencia);
        System.out.println("Saldo = " + saldo);


    }
}
