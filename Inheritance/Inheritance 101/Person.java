/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M3: Inheritance 101 Lab
 */

public class Person{
    //data fields
    private String name;
    private int age;
    private String ssn;
    private boolean alive;

    //no-arg constructor
    public Person(){

    }
    //fully loaded constructor
    public Person(String n, int a, String s, boolean al) {
        this.name = n;
        this.age =a;
        this.ssn = s;
        this.alive = al;
    }
    //mutator
    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setSsn(String newSsn){
        this.ssn = newSsn;
    }
    public void setAlive(boolean newAlive){
        this.alive = newAlive;
    }
    //accessor
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSsn(){
        return this.ssn;
    }
    public boolean getAlive(){
        return this.alive;
    }

    //toString method
    public String toString(){
        String s = "";
        s += "\n Name: " + this.name;
        s += "\n Age: " + this.age + " years old";
        s += "\n SSN Information: " + this.ssn;
        s += "\n Is alive: " + this.alive;
        return s;
    }


}

