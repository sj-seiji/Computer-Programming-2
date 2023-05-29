public class Professor {
    //data fields
    private String name;
    private String department;
    private double annual_salary;
    private int year_in_profession;


    //constructor with parameters
    public Professor(String n, String dep, double salary, int year){
        this.name = n;
        this.department = dep;
        this.annual_salary = salary;
        this.year_in_profession = year;
    }

    //copy constructor
    public Professor(Professor p){
        if(p == null || p.name.equals("") || p.department.equals("")|| p.annual_salary <= 0 || p.year_in_profession <= 0){
            System.out.println("Invalid Professor Object.");
            System.exit(0);
        }
        this.name = p.name;
        this.department = p.department;
        this.annual_salary = p.annual_salary;
        this.year_in_profession = p.year_in_profession;
    }

    //mutators
    public void setName(String newName){
        name = newName;
    }
    public void setDepartment(String newDepartment){
        department = newDepartment;
    }
    public void setAnnual_salary(double newSalary){
        annual_salary = newSalary;
    }
    public void setYear_in_profession(int newYearInProfession){
        year_in_profession = newYearInProfession;
    }
    //accessors
    public String getName(){
        return this.name;
    }
    public String getDepartment(){
        return this.department;
    }
    public double getAnnual_salary(){
        return this.annual_salary;
    }
    public int getYear_in_profession(){
        return this.year_in_profession;
    }

    //toString method
    public String toString(){
        String s = "";
        s += "Professor Information: \n";
        s+= "Registered Name: " + this.name;
        s+= "\nDepartment: " + this.department;
        s+= "\nAnnual Salary: " + this.annual_salary;
        s+= "\nNumber of years in profession: " + year_in_profession + "\n";
        return s;
    }
}

