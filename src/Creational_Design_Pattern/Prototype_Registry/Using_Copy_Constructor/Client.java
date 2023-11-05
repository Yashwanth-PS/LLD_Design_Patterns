package Creational_Design_Pattern.Prototype_Registry.Using_Copy_Constructor;

public class Client {
    public static void main(String[] args) {

        Student proto1 = new Student();
        proto1.setSchoolName("School");

        System.out.println(proto1);

        StudentRegistry studentregistry = new StudentRegistry();

        studentregistry.registerPrototype("proto1", proto1);

        Student student1 = studentregistry.getPrototype("proto1").clone();
        student1.setName("Ram");
        student1.setAge(15);

        Student student2 = studentregistry.getPrototype("proto1").clone();
        student2.setName("Shyam");
        student2.setAge(16);

        System.out.println(student1);
        System.out.println(student2);
    }
}