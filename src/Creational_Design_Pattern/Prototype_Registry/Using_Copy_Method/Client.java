package Creational_Design_Pattern.Prototype_Registry.Using_Copy_Method;

public class Client {
    public static void main(String[] args) {
        // Step4: Create the Prototype Object in the client class,
        // with the help of setters, just assign the default values of the prototype
        Student studentProto1 = new Student();
        studentProto1.setBatchName("July22");
        studentProto1.setAvgBatchPsp(90);
        studentProto1.setInstructorName("Sandeep Sinha");
        studentProto1.setMonthOfEnrollment("July");
        studentProto1.setCurrentModule("LLD");

        Student studentProto2 = new Student();
        studentProto2.setBatchName("Aug22");
        studentProto2.setAvgBatchPsp(80);
        studentProto2.setInstructorName("Sumeet Malik");
        studentProto2.setMonthOfEnrollment("August");
        studentProto2.setCurrentModule("DSA");

        // Step8: Register the prototypes using the register method
        // by passing the key and the Prototype Object
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.register("July22", studentProto1);
        studentRegistry.register("Aug22", studentProto2);

        // Step10: Using the get method get the prototype object
        // using the copy method make a deep copy of the object to get the required default attribute values
        Student yash = studentRegistry.get("July22").copy();
        yash.setName("Yash"); // and set the remaining attributes
        yash.setEmail("yash@gmail.com");
        yash.setPhoneNumber("9876543210");

        Student nikki = studentRegistry.get("Aug22").copy();
        nikki.setName("Nikki");
        nikki.setEmail("nikki@gmail.com");
        nikki.setPhoneNumber("8976543210");

        System.out.println(yash);
        System.out.println(nikki);
    }
}
