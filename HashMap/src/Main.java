import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        HashMap<String , Integer> marks = new HashMap<>();
        marks.put("ALi",95);
        marks.put("Ahmad",100);
        System.out.println(marks);
        System.out.println(marks.get("ALi"));
    }
}