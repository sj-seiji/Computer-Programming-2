/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M3: Inheritance 101 Lab
 */

public class Student1 extends Person{
    //data fields
    private String stu_id;
    private double GPA;
    private String grade;

    //fully loaded constructor
    public Student1(String n, boolean al, int a, String s, String i, double gpa, String g){
        super(n,al, a,s);
        this.stu_id = i;
        this.GPA = gpa;
        this.grade = g;
    }
    //copy constructor
    public Student1(Student1 a){
        super(a.getName(), a.getAlive(), a.getAge(), a.getSsn());
        if(a == null || a.stu_id.equals("") ||  a.GPA <=0 || a.grade.equals("")){
            System.out.println("Invalid");
            System.exit(1);
        }
        this.stu_id = a.stu_id;
        this.GPA = a.GPA;
        this.grade = a.grade;
    }
    //no-arg constructor
    public Student1(){

    }


    //mutators
    public void setStu_id(String newID){
        this.stu_id = newID;
    }
    public void setGPA(double newGPA){
        this.GPA = newGPA;
    }
    public void setGrade(String newGrade){
        this.grade = newGrade;
    }
    //accessors
    public String getStu_id(){
        return this.stu_id;
    }
    public double getGPA(){
        return this.GPA;
    }
    public String getGrade(){
        return this.grade;
    }

    //toString method
    public String toString(){
        String s = super.toString();
        s+= "\n ID number: " + this.stu_id;
        s+= "\n GPA: " + this.GPA;
        s+= "\n Grade: " + this.grade + "\n";
        return s;
    }
}