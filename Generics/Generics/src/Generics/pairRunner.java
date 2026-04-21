package Generics;

public class pairRunner {
        public static void main(String[] args){
            Pair<String,Integer> student=new Pair<>("Ankush",19);
            System.out.println("Name: "+student.getFirst());
            System.out.println("Age: "+student.getSecond());
        }
    }

