public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        System.out.println("Bom dia");

        minhaListaEncadeada.add("Teste1");
        minhaListaEncadeada.add("Teste2");
        minhaListaEncadeada.add("Teste3");
        minhaListaEncadeada.add("Teste4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

    }
}
