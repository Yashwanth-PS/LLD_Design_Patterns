package Creational_Design_Pattern.Prototype_Registry.Intelligent_Student_CaseStudy;

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

    public String getBatchName() {
        return batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getCurrentModule() {
        return currentModule;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getMonthOfEnrollment() {
        return monthOfEnrollment;
    }
}
