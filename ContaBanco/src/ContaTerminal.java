public class ContaTerminal {
    int numero;
    String agencia, nomeCliente;
    double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nOlá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque.";
    }
}
