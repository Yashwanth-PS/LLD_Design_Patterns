package Creational_Design_Pattern.Prototype_Registry.Merit_Student_CaseStudy;

public class Student implements Prototype {
    private String name;
    private int age;
    private String schoolName;

    public Student() { // Default Constructor
    }

    public Student(Student prototype){ // Copy Constructor
        this.age = prototype.age;
        this.name = prototype.name;
        this.schoolName = prototype.schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}