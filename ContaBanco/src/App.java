import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Por favor, digite o número!");
        int numero = in.nextInt();

        System.out.print("Por favor, digite o número da Agência!");
        String agencia = in.next();

        System.out.print("Por favor, digite o nome do cliente!");
        String nomeCliente = in.next();

        System.out.print("Por favor, digite o saldo!");
        double saldo = in.nextDouble();

        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        System.out.println(contaTerminal);

        in.close();   
    }
}
