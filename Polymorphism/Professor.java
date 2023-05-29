/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M4: Polymorphism Lab
 */

public class Professor extends Person{
    private String fac_id;
    private String research_area;
    private int salary;
    private int num_vacation;


    public Professor(String id, String research, int sa, int numV) {
        this.fac_id = id;
        this.research_area = research;
        this.salary = sa;
        this.num_vacation = numV;
    }

    public void getPaid(){
        System.out.println(" Face ID: " + this.fac_id);
        System.out.println(" Research Area: " + this.research_area);
        System.out.println(" Salary: $" + this.salary);
        System.out.println(" Type of Salary: " + "Monthly");
    }
    public void getVacation(){
        System.out.println(" Number of vacation: " + this.num_vacation);
        System.out.println(" Number of vacation days/weeks given: " + "3 months");

    }

    //mutators and accessors
    public String getFac_id() {
        return fac_id;
    }

    public void setFac_id(String id) {
        this.fac_id = id;
    }

    public String getResearch_area() {
        return research_area;
    }

    public void setResearch_area(String research) {
        this.research_area = research;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int sa) {
        this.salary = sa;
    }

    public int getNum_vacation() {
        return num_vacation;
    }

    public void setNum_vacation(int numV) {
        this.num_vacation = numV;
    }
    //toString

    @Override
    public String toString() {
        String s = "Professor Info: ";
        s += "\n Face ID: " + this.fac_id;
        s += "\n Research Area: " + this.research_area;
        s += "\n Salary: $" + this.salary;
        s += "\n Num of Vacation: " + this.num_vacation + " months";
        return s;
    }
}
