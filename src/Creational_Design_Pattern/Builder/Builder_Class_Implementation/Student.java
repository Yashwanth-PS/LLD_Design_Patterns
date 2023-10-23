package Creational_Design_Pattern.Builder.Builder_Class_Implementation;

import Creational_Design_Pattern.Builder.Builder_Class_Implementation.Exceptions.InvalidGradYearException;
import Creational_Design_Pattern.Builder.Builder_Class_Implementation.Exceptions.InvalidNameException;
import Creational_Design_Pattern.Builder.Builder_Class_Implementation.Exceptions.InvalidYoeException;

public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradYear;
    private double psp;
    private String batchName;
    private Student(Builder builder){ // Copy Constructor
        this.id = builder.id;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
        this.batchName = builder.batchName;
    }
    public static Builder builder(){
        Builder b = new Builder();
        return b;
    }

    // Builder/Helper Class
    static class Builder { // Nested/Inner Class --> Class inside a class
        private int id;
        private String name; // Validate --> Name is not null
        private int yoe; // Validate --> yoe >= 1
        private int gradYear; // Validate --> gradYear >= 2022
        private double psp;
        private String batchName;
        public Builder setId(int id) {
            this.id = id;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }
        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }
        private void validate(){ // Check Point
            if(this.name == null){ // Check Point
                throw new InvalidNameException("Name should not be null");
            }
            if(this.yoe < 1){ // Check Point
                throw new InvalidYoeException("YOE should be greater than 1");
            }
            if(this.gradYear > 2022){ // Check Point
                throw new InvalidGradYearException("Grad Year should be greater than 2022");
            }
        }
        public Student build(){
            this.validate(); // Validate the builder object
            Student s =new Student(this); // Call the Student constructor
            return s; // Return the student object
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yoe=" + yoe +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                '}';
    }
}
