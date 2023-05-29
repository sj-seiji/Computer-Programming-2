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


    //constructor with parameters
    public Teacher(String n, boolean al, int a, String s, String i, double sa, int year){
        super(n, al, a,s);
        this.id = i;
        this.salary = sa;
        this.num_yr_profession = year;
    }
    //copy-constructor
    public Teacher(Teacher a){
        super(a.getName(), a.getAlive(), a.getAge(), a.getSsn());
        if(a == null || a.id.equals("") ||  a.salary <=0 || a.num_yr_profession <= 0){
            System.out.println("Invalid");
            System.exit(1);
        }
        this.id = a.id;
        this.salary = a.salary;
        this.num_yr_profession = a.num_yr_profession;
    }
    //no-arg constructor
    public Teacher(){

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
