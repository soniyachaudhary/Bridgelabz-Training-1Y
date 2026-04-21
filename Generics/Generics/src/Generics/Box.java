package Generics;

import java.util.ArrayList;

public class Box {
    public static void main() {
      ArrayList list=new ArrayList();
      list.add("sona");
      list.add(1);
      list.add(121.31);
      list.add("s");
        System.out.println(list);
        int index = (int) list.get(1);
        System.out.println(index);
    }
}
