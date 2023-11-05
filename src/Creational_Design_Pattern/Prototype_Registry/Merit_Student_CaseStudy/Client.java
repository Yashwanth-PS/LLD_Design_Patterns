package Creational_Design_Pattern.Prototype_Registry.Merit_Student_CaseStudy;

public class Client {
    public static void main(String[] args) {

        Student proto1 = new Student();
        proto1.setSchoolName("School");

        System.out.println(proto1);

        Student student1 = proto1.clone();
        student1.setName("Ram");
        student1.setAge(15);

        Student student2 = proto1.clone();
        student2.setName("Shyam");
        student2.setAge(16);

        System.out.println(student1);
        System.out.println(student2);

        MeritStudent meritProto1 = new MeritStudent();
        meritProto1.setSchoolName("School2");
        meritProto1.setScholarShip(50);

        System.out.println(meritProto1);

        MeritStudent meritStudent1 = meritProto1.clone();
        meritStudent1.setName("Ram");
        meritStudent1.setAge(15);

        MeritStudent meritStudent2 = meritProto1.clone();
        meritStudent2.setName("Shyam");
        meritStudent2.setAge(16);

        System.out.println(meritStudent1);
        System.out.println(meritStudent2);
    }
}