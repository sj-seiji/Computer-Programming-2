/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M3: Inheritance 101 Lab
 */

public class Teacher extends Person{
    //data fields
    private String id;
    private double salary;
    private int num_yr_profession;


    //no arg constructor
    public Teacher(){

    }
    //constructor with parameters
    public Teacher(String n, int a, String s, boolean al, String i, double sa, int year){
        super(n,a,s,al);
        this.id = i;
        this.salary = sa;
        this.num_yr_profession = year;
    }

    //mutators
    public void setId(String newId){
        this.id = newId;
    }
    public void setSalary(double newSalary){
        this.salary = newSalary;
    }
    public void setYear_in_profession(int newYearInProfession){
        this.num_yr_profession = newYearInProfession;
    }
    //accessors
    public String getId(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getNum_yr_profession(){
        return this.num_yr_profession;
    }

    //toString method
    public String toString(){
        String s = super.toString();
        s+= "\n ID: " + this.id;
        s+= "\n Salary: " + this.salary + " Dollars";
        s+= "\n Number of years in profession: " + this.num_yr_profession + " years\n";
        return s;
    }
}
