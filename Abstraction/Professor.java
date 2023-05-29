
public class Professor extends Employee{
    private double salary;
    private int num_vacation;
    @Override
    public double getPay() {
        return salary /12.00; //monthly salary
    }
    @Override
    public int getDaysOff() {
        return num_vacation;
    }
    //fully loaded
    public Professor(double s, int numV){
        this.salary = s;
        this.num_vacation =numV;
    }
    //mutator
    public void setSalary(double s) {
        this.salary = s;
    }
    public void setNum_vacation(int numV) {
        this.num_vacation = numV;
    }
    //accessor
    public double getSalary() {
        return this.salary;
    }
    public int getNum_vacation() {
        return this.num_vacation;
    }

    //toString
    public String toString(){
        String s = "";
        s += "Salary: " + this.salary;
        s += "Number of vacation: " + this.num_vacation;
        return s;
    }
}