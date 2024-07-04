package Data_Structure.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_HashMap {
    
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cake");
        map.put(4, "Milk");

        //map.forEach((x,y) -> System.out.println(x + " : " + y));

        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
