package Creational_Design_Pattern.Builder.Map_Implementation;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {

        HashMap<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "Yash");
        map.put("age", 23);
        map.put("email", "yash@gmail.com");

        Student s = new Student(map);

        System.out.println(s);
    }
}