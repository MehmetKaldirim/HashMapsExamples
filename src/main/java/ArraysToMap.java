import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class ArraysToMap {
    public static void main(String[] args) {
        int  nums[] = {1,2,3,4,5};
        int  nums1[];
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();

        final HashMap<Integer, int[]> test = new HashMap();

        test.put(-5, new int[] {4, 8, -6});
        System.out.println(test.get(-5));
        System.out.println("\n" + test.get(-5)[1]);



        for (int i = 0; i <nums.length ; i++) {
            map.put(i, nums);

        }


        for (int i = 0; i <nums.length ; i++) {
            System.out.println("\n" + map.get(i)[i]);
        }

        map.values().forEach(a-> System.out.println(Arrays.toString(a)));
        map.keySet().forEach(a-> System.out.println(a));

        System.out.println("---geliyorum-------------");

        for (Integer i : map.keySet()) {
            System.out.println("key: " + i + " value : " + Arrays.toString(map.get(i)));
        }

        System.out.println("---geliyorum-------------");

        for (Integer i : map.keySet()) {

            System.out.println("key: " + i + " value : " + Arrays.toString(map.get(i)));
        }
    }
}
