package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> obj = new HashMap<String, Integer>();

        obj.put("Rice", 52);
        obj.put("Flour",22);
        obj.put("Wheat",26);

        System.out.println(obj.values());

        Set<String> keys = obj.keySet();
        for(String key : keys)
        {
            System.out.println("Cost of "+key+ " is " +obj.get(key) );
        }

        System.out.println(obj.clone());

        System.out.println(obj.containsKey("Flour"));
        System.out.println(obj.containsValue("26"));

        System.out.println(obj.entrySet());
        System.out.println(obj.isEmpty());

        System.out.println(obj.values());

    }


}
