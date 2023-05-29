/**
 * Seiji Zapanta and Sri Varshini Priya Bitla
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * Homework Assignment #2: Composition & Inheritance
 */

public class Person{
    //data fields
    private String name;
    private boolean alive;
    private int age;
    private String ssn;

    //fully loaded constructor
    public Person(String newName, boolean newAlive, int newAge, String newSsn) {
        this.name = newName;
        this.alive = newAlive;
        this.age = newAge;
        this.ssn = newSsn;

    }

    //mutator
    public void setName(String newName){
        this.name = newName;
    }
    public void setAlive(boolean newAlive){
        this.alive = newAlive;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setSsn(String newSsn){
        this.ssn = newSsn;
    }
    //accessor
    public String getName(){
        return this.name;
    }
    public boolean getAlive(){
        return this.alive;
    }
    public int getAge(){
        return this.age;
    }
    public String getSsn(){
        return this.ssn;
    }


    //toString method
    public String toString(){
        String s = "";
        s += "\n  Name: " + this.name;
        s += "\n  Is alive: " + this.alive;
        s += "\n  Age: " + this.age + " years old";
        s += "\n  SSN Information: " + this.ssn;
        return s;
    }


}