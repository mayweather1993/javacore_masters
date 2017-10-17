package hashtable;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String , Integer> stat = new HashMap<>();

        stat.put("Kiev" , 1000000);
        stat.put("Dnepr" , 900000);
        stat.put("Zp" , 400000);

        Integer population = stat.get("Kiev");
		System.out.println(population);
		stat.remove("Kiev");
		population = stat.get("Kiev");
		System.out.println(population);
    }
}
