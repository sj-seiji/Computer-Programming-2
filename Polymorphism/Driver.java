/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M4: Polymorphism Lab
 */


public class Driver {
    public static void main(String[] args) {
        Person p = new Person();
        Professor prof1 = new Professor("7281920", "Genetics", 150000, 2);
        Secretary s1 = new Secretary("1031274", 7, 75000, 1);
        Student_worker student1 = new Student_worker("9182710", "Senior", 20000, 2, "Programming");

        //print out prof info
        System.out.println("Professor Info: ");
        prof1.getPay(prof1);
        prof1.getRest(prof1);

        //print out secretary info
        System.out.println("\n\nSecretary Info: ");
        s1.getPay(s1);
        s1.getRest(s1);

        //print out student TA info
        System.out.println("\n\nStudent TA Info:");
        student1.getPay(student1);
        student1.getRest(student1);
    }
}
