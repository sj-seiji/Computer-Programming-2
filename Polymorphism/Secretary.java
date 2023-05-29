/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M4: Polymorphism Lab
 */

public class Secretary extends Person{
    private String fac_id;
    private int num_service;
    private int salary;
    private int num_vacation;

    public Secretary(String id, int numS, int sa, int numV){
        this.fac_id = id;
        this.num_service = numS;
        this.salary = sa;
        this.num_vacation = numV;
    }
    public void getPaid(){
        System.out.println(" Face ID: " + this.fac_id);
        System.out.println(" Number of Service: " + this.num_service);
        System.out.println(" Salary: $" + this.salary);
        System.out.println(" Type of Salary: " + "Bi-weekly");
    }
    public void getVacation(){
        System.out.println(" Number of vacation: " + this.num_vacation);
        System.out.println(" Number of vacation days/weeks given: " + "1 month");

    }
    //mutators
    public void setFac_id(String id){
        this.fac_id = id;
    }
    public void setNum_service(int numS){
        this.num_service = numS;
    }
    public void setSalary(int sa){
        this.salary = sa;
    }
    public void setNum_vacation(int numV){
        this.num_vacation = numV;
    }
    //accessors
    public String getFac_id(){
        return this.fac_id;
    }
    public int getNum_service(){
        return this.num_service;
    }
    public int getSalary(){
        return this.salary;
    }
    public int getNum_vacation(){
        return this.num_vacation;
    }
    //toString
    @Override
    public String toString() {
        String s = "\nSecretary Info: ";
        s += "\n Faculty ID: " + this.fac_id;
        s += "\n Number of Service: " + this.num_service;
        s += "\n Salary: $" + this.salary;
        s += "\n Number of vacation: " + this.num_vacation + " month";
        return s;
    }
}
