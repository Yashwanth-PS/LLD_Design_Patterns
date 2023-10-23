package Creational_Design_Pattern.Builder.Builder_Class_Implementation;

public class Client {
    public static void main(String[] args) {
        Student s = Student.builder() // returns the empty builder object
                .setId(1)
                .setName("Yash")
                .setGradYear(2021)
                .setYoe(2)
                .setPsp(90)
                .setBatchName("July 2021")
                .build(); // validate the builder object
        System.out.println(s);
    }
}