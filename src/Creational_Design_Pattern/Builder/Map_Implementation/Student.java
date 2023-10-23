package Creational_Design_Pattern.Builder.Map_Implementation;

import java.util.Map;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    public Student(Map<String, Object> map){ // As soon as you go inside the constructor Java will create an Object
        id = (int) map.get("id"); // Down Casting is not recommended in Java
        if ((String) map.get("name") != null){ // Some Validations
            name = (String) map.get("name"); // Down Casting is not recommended in Java
        }
        age = (int) map.get("age"); // Down Casting is not recommended
        email = (String) map.get("email"); // Down Casting is not recommended in Java
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
