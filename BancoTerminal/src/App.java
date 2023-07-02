import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean stts = true;
        BancoTerminal bancoaleatorio = new BancoTerminal("Banco Aleatório");

        do {
            int opt = bancoaleatorio.mostrarMenu(in);
            if (opt == 0)
                stts = false;
        } while (stts);
    }

}