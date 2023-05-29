/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * M1: toString and Copy Constructor Lab
 */

public class professorDemo {
    public static void main(String[] args) {
        Professor p1 = new Professor("Mark Luis", "Business and Management", 97.132,30);

        Professor p2 = new Professor(p1);
        p2.setName("Harold Bacan");
        p2.setYear_in_profession(34);

        Professor p3 = new Professor(p2);
        p3.setName("Samson Clay");
        p3.setAnnual_salary(112.347);
        p3.setDepartment("Engineering and Computing Sciences");

        //uses toString method to print out content
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
