import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoTerminal {
    private String nome;
    private List<Conta> contas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public BancoTerminal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void mostrarContas(List<Conta> contas) {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public void criarConta(Scanner in) {
        System.out.print("Informe o seu nome: ");
        String nome_cliente = in.next();

        clientes.add(new Cliente(nome_cliente));

        contas.add(new ContaCorrente(clientes.get(clientes.size() - 1)));
        contas.add(new ContaPoupanca(clientes.get(clientes.size() - 1)));

        int num = contas.get(contas.size() - 1).getNumero();
        System.out.println("Conta criada com sucesso! Seu numero é: " + num);
    }


    public int numConta(Scanner in) {
        System.out.print("Digite o numero da sua conta: ");
        int num = in.nextInt();

        return num;
    }

    public void mostraInfoConta(Scanner in, int num) {
        for (Conta conta : contas) {
            if (conta.getNumero() == num) {
                conta.imprimirInfosComuns();
            }
        }
    }

    public double perguntaValor(Scanner in) {
        System.out.print("Digite o valor: ");
        double val = in.nextDouble();

        return val;
    }

    public int mostrarMenu(Scanner in) {
        System.out.println("1. Criar conta\n" +
                "2. Depositar\n" +
                "3. Sacar\n" +
                "4. Transferir\n" +
                "5. Acessar conta\n" +
                "0. Cancelar");

        System.out.print("Qual operação deseja realizar?");
        int operacao = in.nextInt();

        switch (operacao) {
            case 1:
                criarConta(in);
                break;
            case 2:
                contas.get(numConta(in)-1).depositar(perguntaValor(in));
                break;
            case 3:
                contas.get(numConta(in)-1).sacar(perguntaValor(in));
                break;
            case 4:
                contas.get(numConta(in)-1).transferir(perguntaValor(in), contas.get(numConta(in)-1));
                break;
            case 5:
                int num = numConta(in);
                mostraInfoConta(in, num);
                contas.get(num - 1).imprimirExtrato();;
                break;
            default:
                System.out.println("Opção inválida. Insira o valor novamente");
        }
        return operacao;
    }
}