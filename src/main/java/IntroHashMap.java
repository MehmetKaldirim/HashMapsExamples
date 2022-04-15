import java.util.HashMap;
import java.util.Map;

public class IntroHashMap<habuMap> {
    public static void main(String[] args) {
        HashMap<String, String > capitalCities = new HashMap<String, String>();

        //Add keys and values (Country,City)
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println("------------get()-------------");
        //Acces an Item get() method
        String at = capitalCities.get("USA");
        System.out.println(at);

        System.out.println("------------remove()-------------");
        //Remove an Item remove();
        capitalCities.remove("Germany");
        System.out.println(capitalCities);

        capitalCities.put("Turkey", "Berlin");
        capitalCities.put("Germany", "Berlin");


        System.out.println(capitalCities);

        //Remove all items, use the clear() method and size()
        System.out.println("-------------------------");
        //capitalCities.clear();
        System.out.println(capitalCities.size());
        capitalCities.put("Germany", "Berlin");
        System.out.println(capitalCities);
        System.out.println("-------------------------");

        //Loop Through a HashMap with keySet() and values()
        capitalCities.values().forEach(a-> System.out.println(a));
        capitalCities.keySet().forEach(a-> System.out.println(a));

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value : " + capitalCities.get(i));
        }

        System.out.println("------- copyMap Method------------------");
        Map<String, String > copyCapital = copyMap(capitalCities);
        System.out.println(copyCapital);

        System.out.println("------------containsKey / entrySet() returns all set Of keysand values -------------");
        String result =capitalCities.entrySet().stream().anyMatch(a->a.getKey().equals("England")) ? capitalCities
                .get("England") : capitalCities.get("Germany");

        String result1 = capitalCities.containsKey("England") ? capitalCities
                .get("England") : capitalCities.get("Germany");

        System.out.println(result + " = " + result1);

        System.out.println("--------------getOrDeafult method ------------");
        String a = capitalCities.getOrDefault("England", "Ankara");
        System.out.println("Return of a " + a );

        String b = capitalCities.getOrDefault("Turkey", "Ankara");
        System.out.println("Return of b " + b );

        System.out.println("no existing key " + capitalCities.get("Turkey") );
        System.out.println("no existing key " + capitalCities.getOrDefault("Turkey", "Default Value") );

        System.out.println("--------------replace(key , old , new ) ------------");

        capitalCities.replace("England" , "London", "Ankara");
        System.out.println(" after replacing new cap of england = " + capitalCities.get("England"));
        capitalCities.replace("England" ,  "London");
        System.out.println(" after replacing again cap of england = " + capitalCities.get("England"));


        System.out.println("-----------putIfAbsent------------------------");
        capitalCities.putIfAbsent("Turkey", "Ankara");
        System.out.println(capitalCities);

        System.out.println("-----------remove-----------------------------");
        capitalCities.remove("Turkey");
        System.out.println(capitalCities);

        System.out.println("-----------replaceAll--------------------------");
        Map<Integer, Integer> habuMap = new HashMap<>();
        for (int i = 1; i < 5; i++) {
            habuMap.put(i,i);
        }

        System.out.println("before replace all = ");
        System.out.println(habuMap);

        habuMap.replaceAll((key, oldValue) -> oldValue + 10);

        System.out.println("after replace all  with adding 10 = ");
        System.out.println(habuMap);

    }


        public static <K, V> Map<K, V> copyMap(Map<K, V> original){
            Map<K,V > second_Map = new HashMap<>();
            for (Map.Entry<K, V> entry : original.entrySet()){

                second_Map.put(entry.getKey(), entry.getValue());
            }
            return second_Map;
        }

}


