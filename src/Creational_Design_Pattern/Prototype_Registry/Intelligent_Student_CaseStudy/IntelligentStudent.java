package Creational_Design_Pattern.Prototype_Registry.Intelligent_Student_CaseStudy;

public class IntelligentStudent extends Student{
    private int iq;
    public IntelligentStudent(){

    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent copy(){
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.iq = this.iq;
        intelligentStudent.setBatchName(this.getBatchName());
        intelligentStudent.setAvgBatchPsp(this.getAvgBatchPsp());
        intelligentStudent.setInstructorName(this.getInstructorName());
        intelligentStudent.setMonthOfEnrollment(this.getMonthOfEnrollment());
        intelligentStudent.setCurrentModule(this.getMonthOfEnrollment());
        return intelligentStudent;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "iq=" + iq +
                ", batchName='" + super.getBatchName() + '\'' +
                ", avgBatchPsp=" + super.getAvgBatchPsp() +
                ", instructorName='" + super.getInstructorName() + '\'' +
                ", monthOfEnrollment='" + super.getMonthOfEnrollment() + '\'' +
                ", currentModule='" + super.getCurrentModule() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", email='" + super.getEmail() +
                '}';
    }
}
