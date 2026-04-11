package MultiThreading;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main() {
        List<String> List = new ArrayList<>();
      List.add("sona");
        List.add("soni");
        List.add("shiv");
        List.add("shivi");
        System.out.println(List);

        boolean b = List.isEmpty();
        System.out.println(b);

    }
}
