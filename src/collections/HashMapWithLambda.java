package collections;



import java.util.HashMap;
import java.util.Map;

public class HashMapWithLambda {

    public static void main(String[] args) {

        Map<Integer,String> item = new HashMap<>();
        item.put(1,"Ankush");
        item.put(2,"Bharat");
        item.put(3,"Dinesh");
        item.put(4,"Dileep");
        item.put(5,"E");



        //Traditional way of calling the data
        for(Map.Entry<Integer,String> e : item.entrySet())
        {
            System.out.println("Roll No : "+e.getKey()+", Name : "+e.getValue());
        }

        System.out.println();

        //Using Lambda Expression
        //item.forEach((k,v)->System.out.println("Roll No : "+k+", Name : "+v));

        //Using Lambda Expression with a condition
        item.forEach((k,v)->{
                System.out.println("Roll No : "+k+", Name : "+v);
                if("E".equals(v))
                {
                    System.out.println("hello E");
                }
        });


    }
}
