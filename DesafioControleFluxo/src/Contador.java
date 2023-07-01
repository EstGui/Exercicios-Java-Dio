import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = in.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = in.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

        in.close();
	}
    
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois || parametroUm == parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
		
		int contagem = parametroDois - parametroUm;
		for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número: " + (i+1));
        }
	}
}