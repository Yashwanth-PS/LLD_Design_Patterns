package Creational_Design_Pattern.Builder.Map_Implementation;

import java.util.Map;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    public Student(Map<String, Object> map){ // As soon as you go inside the constructor Java will create an Object
        String name = (String) map.get("Name"); // Down Casting is not recommended
        if (name != null){
            // Some Validations
            // Initialization
        }
        String age = (String) map.get("age"); // Down Casting is not recommended
    }
}
