package generics;

public class TestPair {
    public static void main(String[] args) {
        Pair<String , Integer> kiev = new Pair<>("Kiev" , 893);
        Pair<String , Integer> kazan = new Pair<>("Kazan" , 92);
        System.out.printf("Phone code of %s is %d%n" , kiev.getFirst() , kiev.getSecond());
        System.out.printf("Phone code of %s is %d%n" , kazan.getFirst() , kazan.getSecond());

    }
}
