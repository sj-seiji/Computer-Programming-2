import java.util.Date;

public abstract class Employee {
    private String ssn;
    private String name;
    private Date hireDate;
    public abstract double getPay();
    public abstract int getDaysOff();

    public boolean samePay(Employee e){
        return (this.getPay() == e.getPay());
    }
    public boolean daysOff(Employee e){
        return (this.getDaysOff() == e.getDaysOff());
    }

    //no-arg constructor
    public Employee(){

    }
    //fully loaded constructor
    public Employee(String s, String n, Date hireD){
        this.ssn = s;
        this.name = n;
        this.hireDate = hireD;
    }
    //mutator and accessors
    public void setSsn(String newSsn) {
        this.ssn = newSsn;
    }
    public String getSsn() {
        return ssn;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }
    public void setHireDate(Date newHireDate) {
        this.hireDate = newHireDate;
    }
    public Date getHireDate() {
        return hireDate;
    }
    //toString method
    public String toString(){
        String s = "";
        s += "Name: " + this.name;
        s += "SSN: " + this.ssn;
        s += "Hire Date: " + this.hireDate;
        return s;
    }

}
