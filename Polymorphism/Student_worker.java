/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M4: Polymorphism Lab
 */

public class Student_worker extends Person{
    private String ta_id;
    private String year;
    private int salary;
    private int num_vacation;
    private String course_taught;

    public Student_worker(String id, String y, int sa, int numVac, String course){
        this.ta_id = id;
        this.year = y;
        this.salary = sa;
        this.num_vacation = numVac;
        this.course_taught = course;
    }
    public void getPaid(){
        System.out.println(" TA ID: " + this.ta_id);
        System.out.println(" Year: " + this.year);
        System.out.println(" Course Taught: " + this.course_taught);
        System.out.println(" Salary: $" + this.salary);
        System.out.println(" Type of Salary: " + "Hourly");
    }
    public void getVacation(){
        System.out.println(" Number of vacation: " + this.num_vacation);
        System.out.println(" Number of vacation days/weeks given: " + "Weekends");

    }
    //mutator
    public void setTa_id(String id){
        this.ta_id = id;
    }
    public void setYear(String y){
        this.year = y;
    }
    public void setSalary(int sa){
        this.salary = sa;
    }
    public void setNum_vacation(int numVac){
        this.num_vacation = numVac;
    }
    public void setCourse_taught(String course){
        this.course_taught = course;
    }
    //accessor
    public String getTa_id(){
        return this.ta_id;
    }
    public String getYear(){
        return this.year;
    }
    public int getSalary(){
        return this.salary;
    }
    public int getNum_vacation(){
        return this.getNum_vacation();
    }
    public String getCourse_taught(){
        return this.course_taught;
    }
    //toString
    public String toString(){
        String s = "\nStudent Worker Info: ";
        s += "\n T.A id: " + this.ta_id;
        s += "\n Year: " + this.year;
        s += "\n Salary: $" + this.salary;
        s += "\n Number of Vacation: " + this.num_vacation + " days";
        s += "\n Course Taught: " + this.course_taught;
        return s;
    }
}
