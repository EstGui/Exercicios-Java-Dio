public class App {
    public static void main(String[] args) throws Exception {
        ListaCircular<String> minhaLC = new ListaCircular<>();

        minhaLC.add("c0");
        System.out.println(minhaLC);

        minhaLC.remove(0);
        System.out.println(minhaLC);

        minhaLC.add("c1");
        System.out.println(minhaLC);

        minhaLC.add("c2");
        minhaLC.add("c3");
        System.out.println(minhaLC);

        System.out.println(minhaLC.get(3));
    }
}
