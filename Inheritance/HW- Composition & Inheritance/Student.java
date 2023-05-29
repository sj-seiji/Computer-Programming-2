public class Student extends Person{
    private String stu_id;
    private double gpa;

    //fully loaded constructor
    public Student(String newName, boolean newAlive, int newAge, String newSsn, String newId, double newGpa){
        super(newName, newAlive, newAge, newSsn);
        this.stu_id = newId;
        this.gpa = newGpa;

    }
    //copy constructor
    public Student(Student s){
        super(s.getName(), s.getAlive(), s.getAge(), s.getSsn());
        if(s == null || s.stu_id.equals("") ||  s.gpa <=0){
            System.out.println("Invalid");
            System.exit(1);
        }
        this.stu_id = s.stu_id;
        this.gpa = s.gpa;
    }
    //mutators
    public void setStu_id(String newId) {
        this.stu_id = newId;
    }
    public void setGpa(double newGpa) {
        this.gpa = newGpa;
    }
    //accessors
    public String getStu_id() {
        return this.stu_id;
    }

    public double getGpa() {
        return this.gpa;
    }
    //toString
    @Override
    public String toString(){
        String s = super.toString();
        s+= "\n  ID number: " + this.stu_id;
        s+= "\n  GPA: " + this.gpa;
        return s;
    }
}

