public class Professor extends Teacher {
    private String speciality;
    private String research_area;
    private String rank;
    private boolean tenured;

    public Professor(String newName, boolean newAlive,int newAge, String newSsn, String i, int sa, int y, String s, String ra, String r, boolean t) {
        super(newName, newAlive, newAge, newSsn, i, sa, y);
        this.speciality = s;
        this.research_area = ra;
        this.rank = r;
        this.tenured = t;
    }

    public Professor(Professor p) {
        super(p.getName(), p.getAlive(), p.getAge(), p.getSsn(), p.getId(), p.getMonthly_salary(), p.getYear_in_profession());
        if (p == null) {
            System.out.println("Professor does NOT exist! Stop!");
            System.exit(1);
        }
        //super(p.getName(), p.getAlive(), p.getAge(), p.getSsn(), p.getId(), p.getMonthly_salary(), p.getYear_in_profession());
        this.speciality = p.speciality;
        this.research_area = p.research_area;
        this.rank = p.rank;
        this.tenured = p.tenured;
    }

    public void setSpeciality(String s) {
        this.speciality = s;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setResearch_area(String ra) {
        this.research_area = ra;
    }

    public String getResearch_area() {
        return this.research_area;
    }

    public void setRank(String r) {
        this.rank = r;
    }

    public String getRank() {
        return this.rank;
    }

    public void setTenured(boolean t) {
        this.tenured = t;
    }

    public boolean getTenured() {
        return this.tenured;
    }

    public String toString() {
        String S = super.toString();
        S += "  Speciality : " + this.speciality + "\n";
        S += "  Research Area : " + this.research_area + "\n";
        S += "  Rank : " + this.rank + "\n";
        S += "  Tenured : " + this.tenured + "\n";
        return S;
    }
}