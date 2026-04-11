package MultiThreading;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main() {
        List<Integer> List = new ArrayList<>();
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        List.add(60);
        List.add(70);
        System.out.println(List);


        boolean b = List.isEmpty();
        System.out.println(b);

        boolean c = List.contains(70);
        System.out.println(c);

        int f = List.get(0);
        System.out.println(f);

         List.remove(0);
        System.out.println(List);


    }
}
