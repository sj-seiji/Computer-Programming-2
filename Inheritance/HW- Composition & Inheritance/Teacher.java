public class Teacher extends Person {
    private String id;
    private int monthly_salary;
    private int year_in_profession;

    public Teacher(String newName, boolean newAlive, int newAge, String newSsn, String i, int sa, int y) {
        super(newName, newAlive, newAge, newSsn);
        this.id = i;
        this.monthly_salary = sa;
        this.year_in_profession = y;
    }

    public Teacher(Teacher t) {
        super(t.getName(), t.getAlive(), t.getAge(), t.getSsn());
        if (t == null) {
            System.out.println("Teacher does NOT exist! Stop!");
            System.exit(0);
        }
        this.id = t.id;
        this.monthly_salary = t.monthly_salary;
        this.year_in_profession = t.year_in_profession;
    }

    public void setId(String i) {
        this.id = i;
    }

    public String getId() {
        return this.id;
    }

    public void setMonthly_salary(int sa) {
        this.monthly_salary = sa;
    }

    public int getMonthly_salary() {
        return this.monthly_salary;
    }

    public void setYear_in_profession(int y) {
        this.year_in_profession = y;
    }

    public int getYear_in_profession() {
        return this.year_in_profession;
    }

    public String toString() {
        String S = super.toString();
        S += "\n  Teacher Id: " + this.id + "\n";
        S += "  Salary: " + this.monthly_salary + "\n";
        S += "  Year in Profession: " + this.year_in_profession + "\n";
        return S;
    }
}