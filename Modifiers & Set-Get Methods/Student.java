/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * M1: Visibility Modifiers and Set/Get Methods Lab
 */

public class Student {
    //data fields
    private String name;
    private String stu_id;
    private double GPA;
    private int age;

    //fully loaded constructor
    public Student(String n, String id, double gpa, int a){
        this.name = n;
        this.stu_id = id;
        this.GPA = gpa;
        this.age = a;
    }
    //no-arg
    public Student(){
    }

    //mutators
    public void setName(String newName){
        this.name = newName;
    }
    public void setStu_id(String newID){
        this.name = newID;
    }
    public void setGPA(double newGPA){
        this.GPA = newGPA;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    //accessors
    public String getName(){
        return this.name;
    }
    public String getStu_id(){
        return this.stu_id;
    }
    public double getGPA(){
        return this.GPA;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
        String s = "";
        s+= "\nStudent Name: " + this.name;
        s+= "\nID number: " + this.stu_id;
        s+= "\nGPA: " + this.GPA;
        s+= "\nAge: " + this.age + "\n";
        return s;
    }
}
