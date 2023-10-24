package Creational_Design_Pattern.Prototype_Registry.Prototype_Registry_Impl;

public class Student { // Step1: Create a Prototype class and define the attributes
    private String batchName;
    private double avgBatchPsp;
    private String instructorName;
    private String monthOfEnrollment;
    private String currentModule;
    private String name;
    private String phoneNumber;
    private String email;
    public Student(){ // Step2: Define an Empty Constructor (Default Constructor)

    }

    // Step3: Define the Setters to set the value to the attributes
    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setMonthOfEnrollment(String monthOfEnrollment) {
        this.monthOfEnrollment = monthOfEnrollment;
    }

    public void setCurrentModule(String currentModule) {
        this.currentModule = currentModule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Step9: Create a copy method within the Prototype class for a deep copy of the object
    public Student copy(){
        Student student = new Student();
        student.batchName = this.batchName;
        student.avgBatchPsp = this.avgBatchPsp;
        student.instructorName = this.instructorName;
        student.monthOfEnrollment = this.monthOfEnrollment;
        student.currentModule = this.currentModule;
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "batchName='" + batchName + '\'' +
                ", avgBatchPsp=" + avgBatchPsp +
                ", instructorName='" + instructorName + '\'' +
                ", monthOfEnrollment='" + monthOfEnrollment + '\'' +
                ", currentModule='" + currentModule + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
