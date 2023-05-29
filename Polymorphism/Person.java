/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M4: Polymorphism Lab
 */

public class Person {
    public void getPaid(){
        System.out.println("Type of Pay is not initialized");
    }
    public void getVacation(){
        System.out.println("Number of vacation days is not initialized");
    }
    public void getPay(Person p){
        p.getPaid();
    }
    public void getRest(Person p){
        p.getVacation();
    }

    //data fields
    private String name;
    private String ssn;
    private int age;
    private boolean alive;

    //no-arg construction
    public Person(){

    }

    //fully loaded
    public Person(String n, String s, int a, boolean al){
        this.name = n;
        this.ssn = s;
        this.age = a;
        this.alive = al;
    }
    //mutator
    public void setName(String n){
        this.name = n;
    }
    public void setSsn(String s){
        this.ssn = s;
    }
    public void setAge(int a){
        this.age = a;
    }
    public void setAlive(boolean al){
        this.alive = al;
    }
    //accessor
    public String getName(){
        return this.name;
    }
    public String getSsn(){
        return this.ssn;
    }
    public int getAge(){
        return this.age;
    }
    public boolean getAlive(){
        return this.alive;
    }
    //toString
    public String toString(){
        String s = "";
        s += "Name: " + this.name;
        s += "SSN: " + this.ssn;
        s += "Age: " + this.age;
        s += "Alive: " + this.alive;
        return s;
    }
}
