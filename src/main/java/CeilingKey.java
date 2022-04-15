import java.util.NavigableMap;
import java.util.TreeMap;

public class CeilingKey {
    public static void main(String[] args)
    {

        // creating tree map
        NavigableMap<Integer, String>
                treemap = new TreeMap<Integer, String>();

        // populating tree map
        treemap.put(1, " A ");
        treemap.put(2, " B ");
        treemap.put(3, " C ");
        treemap.put(4, " D ");
        treemap.put(10, " E ");
        treemap.put(7, " F ");

        // Since 6 is the least value greater than 5,
        // it is returned as the key.
        System.out.println("Ceiling key entry for 5: "
                + treemap.higherKey(4));
    }
}
