public class CollegeStudent extends Student{
    private String major;
    private String grade;

    //fully loaded constructor
    public CollegeStudent(String newName, boolean newAlive, int newAge, String newSsn, String newId, double newGpa, String newMajor, String newGrade){
        super(newName, newAlive, newAge, newSsn, newId, newGpa);
        this.major = newMajor;
        this.grade = newGrade;
    }
    //copy constructor
    public CollegeStudent(CollegeStudent other){
        super(other.getName(), other.getAlive(), other.getAge(), other.getSsn(), other.getStu_id(), other.getGpa());
        if(other == null || other.major.equals("") ||  other.grade.equals("")){
            System.out.println("Invalid Data Entry!");
            System.exit(1);
        }
        this.major = other.major;
        this.grade = other.grade;
    }

    //mutators
    public void setMajor(String newMajor) {
        this.major = newMajor;
    }
    public void setGrade(String newGrade) {
        this.grade = newGrade;
    }
    //accessors
    public String getMajor() {
        return major;
    }
    public String getGrade() {
        return grade;
    }
    //toString method
    public String toString(){
        String s = super.toString();
        s += "\n  Major: " + this.major;
        s += "\n  Grade: " + this.grade;
        return s;
    }
}
