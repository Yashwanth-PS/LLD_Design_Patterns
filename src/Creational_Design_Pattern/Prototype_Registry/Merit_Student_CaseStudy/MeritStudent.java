package Creational_Design_Pattern.Prototype_Registry.Merit_Student_CaseStudy;

public class MeritStudent extends Student {
    private int scholarShip ;

    public  MeritStudent(){

    }

    public  MeritStudent(MeritStudent meritStudent){
        super(meritStudent); // Constructor Chaining
        this.scholarShip = meritStudent.scholarShip;
    }

    public void setScholarShip(int scholarShip) {
        this.scholarShip = scholarShip;
    }

    public MeritStudent clone(){
        return new MeritStudent(this);
    }

    @Override
    public String toString() {
        return "MeritStudent{" +
                "name='" + getName() + "'," +
                " age=" + getAge() + "," +
                " schoolName='" + getSchoolName() + "'," +
                " scholarShip=" + scholarShip +
                '}';
    }
}