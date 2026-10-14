package Collections;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Mohd");
        arr.add("Arsalan");
        arr.add("Azka");

        System.out.println(arr.get(1));
        System.out.println(arr);
        System.out.println(arr.size());

        arr.set(2,"Zeban");
        System.out.println(arr.get(1));
        System.out.println(arr);
System.out.println(arr.size());
    }
}
