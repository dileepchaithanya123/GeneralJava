package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListWithLambda {

    public static void main(String[] args) {

        List<String> i = new ArrayList<String>();

        i.add("Dileep");
        i.add("Chaithanya");
        i.add("Anusha");
        i.add("Nitej");

        //1
        i.forEach(item-> System.out.println(item));

        System.out.println("============================================");

        //2
        i.forEach(item->
        {
            if("Anusha".equals(item))
            {
                System.out.println(item);
            }
        });

        System.out.println("============================================");

        //3.Method Reference
        i.forEach(System.out::println);

        System.out.println("============================================");

        //4.Stream and Fliter
        i.stream().filter(s->s.contains("Anusha")).forEach(System.out::println);



    }
}
