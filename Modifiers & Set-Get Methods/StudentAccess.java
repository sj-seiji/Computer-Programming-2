/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * M1: Visibility Modifiers and Set/Get Methods Lab
 */

public class StudentAccess {
    public static void main(String[] args) {
        Student s1 = new Student("Patrick Bob", "91AUG34HA",3.7,21);
        Student s2 = new Student();
        s2.setName("Tony Stripes");
        s2.setStu_id("10981HYAA");
        s2.setGPA(2.8);
        s2.setAge(20);
        Student s3 = new Student("Rico Cocnut", "981GH1103", 3.1,18);

        System.out.println("First student info: " + s1);
        System.out.println("Second student info: " + s2);
        System.out.println("Third student info: " + s3);
    }
}
