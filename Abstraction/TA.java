import java.util.Date;

public class TA extends Employee {
    private double wageRate;
    private double hours;
    private int num_vacation;
    @Override
    public double getPay() {
        return wageRate / hours; //TAs get pay hourly
    }
    @Override
    public int getDaysOff() {
        return num_vacation;
    }

    //fully loaded constructor
    public TA(double w, double h, int numVac){
        this.wageRate = w;
        this.hours = h;
        this.num_vacation = numVac;
    }
    //mutator
    public void setWageRate(double w) {
        this.wageRate = w;
    }

    public void setHours(double h) {
        this.hours = h;
    }

    public void setNum_vacation(int numV) {
        this.num_vacation = numV;
    }
    //accessors
    public double getWageRate() {
        return this.wageRate;
    }
    public double getHours() {
        return this.hours;
    }
    public int getNum_vacation() {
        return this.num_vacation;
    }

    //toString
    public String toString(){
        String s = "";
        s += "Wage Rate: " + this.wageRate;
        s += "Work Hours: " + this.hours;
        s += "Number of Vacation: " + this.num_vacation;
        return s;
    }
}
