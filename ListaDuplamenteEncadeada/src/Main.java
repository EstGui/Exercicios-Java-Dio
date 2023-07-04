public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLE = new ListaDuplamenteEncadeada<>();

        minhaLE.add("c1");
        minhaLE.add("c2");
        minhaLE.add("c3");
        minhaLE.add("c4");
        minhaLE.add("c5");
        minhaLE.add("c6");
        minhaLE.add("c7");

        System.out.println(minhaLE);
        
        minhaLE.remove(3);
        System.out.println(minhaLE);
        
        minhaLE.add(3, "99");
        System.out.println(minhaLE);
        
        System.out.println(minhaLE.get(3));
    }
}
