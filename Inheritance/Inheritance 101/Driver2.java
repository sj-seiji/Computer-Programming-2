/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M3: Inheritance 101 Lab
 */

public class Driver2 {
    public static void main(String[] args) {
        //using fully loaded constructor from the Student Class
        Student1 s1 = new Student1("Daffy Duck", 21,  "412-0122-123", true, "1291190", 3.5, "Junior");
        System.out.println("Student Information: " + s1.toString());

        //using fully loaded constructor from the Teacher Class
        Teacher t1 = new Teacher("Bugs Bunny", 55,"123-3911-931",  true, "0108212", 155.102, 25);
        System.out.println("\nTeacher Information: " + t1.toString());
    }
}
