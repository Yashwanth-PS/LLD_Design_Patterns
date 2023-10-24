package Creational_Design_Pattern.Prototype_Registry.Intelligent_Student_CaseStudy;

public class Client {
    public static void main(String[] args) {

        IntelligentStudent intStuProto1 = new IntelligentStudent();
        intStuProto1.setIq(100);
        intStuProto1.setBatchName("Jan23");
        intStuProto1.setAvgBatchPsp(90);
        intStuProto1.setInstructorName("Sandeep Sinha");
        intStuProto1.setMonthOfEnrollment("July");
        intStuProto1.setCurrentModule("LLD");

        System.out.println(intStuProto1);

        IntelligentStudent stCopy = intStuProto1.copy();

        System.out.println(stCopy);

    }
}
