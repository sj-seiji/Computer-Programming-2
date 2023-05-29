/**
 * Seiji Zapanta
 * CSCI 185: Computer Programming II
 * Wenjia Li
 * M2 Lab
 */

public class Course {
    //data fields
    public String courseName;
    private String courseNumber;
    public String instructorName;
    private Student[] listStudents;

    //no-arg constructor
    public Course(){

    }
    //fully loaded constructor
    public Course(String name, String cNum, String instructor, Student[]list){
        this.courseName = name;
        this.courseNumber = cNum;
        this.instructorName = instructor;
        this.listStudents = new Student[list.length];

        for(int i = 0; i < list.length; i++ ){
            this.listStudents[i] = new Student(list[i]);
        }
    }
    //mutators and accessors
    public void setCourseName(String name){
        this.courseName = name;
    }
    public String getCourseName(){
        return this.courseName;
    }
    public void setCourseNumber(String cNum){
        this.courseNumber = cNum;
    }
    public String getCourseNumber(){
        return this.courseNumber;
    }
    public void setInstructorName(String instructor){
        this.instructorName = instructor;
    }
    public String getInstructorName(){
        return this.instructorName;
    }
    public void setListStudents(Student[]list){
        this.listStudents = new Student[list.length];
        for(int k = 0; k < list.length; k++ ){
            this.listStudents[k] = new Student(list[k]);
        }
        //Student [] temp = new Student[this.listStudents.length];
    }
    public Student[] getListStudents(){
        Student[] temp = new Student[this.listStudents.length];
        for(int  j= 0; j < temp.length; j++ ){
            temp[j] = new Student(this.listStudents[j]);
        }
        return temp;
    }
    public String toString(){
        String s = "Course Information:\n" + "Coursee Name: " + this.courseName;
        s += "\nCourse Number: " + this.courseNumber;
        s += "\nCourse Instructor: " + this.instructorName + "\n";

        for(int i = 0; i < this.listStudents.length;i++){
            s += "\nStudent #" + (i+1) + " Info: " + this.listStudents[i].toString() + "\n";
        }
        return s;
    }

}
//student class
class Student {
    //data fields
    private String name;
    private String stu_id;
    private double GPA;
    private int age;

    //fully loaded constructor
    public Student(String n, String id, double gpa, int a){
        this.name = n;
        this.stu_id = id;
        this.GPA = gpa;
        this.age = a;
    }
    //copy constructor
    public Student(Student a){
        if(a == null || a.name.equals("") || a.stu_id.equals("") || a.GPA <=0 || a.age <=0){
            System.out.println("Invalid");
        }
        this.name = a.name;
        this.stu_id = a.stu_id;
        this.GPA = a.GPA;
        this.age = a.age;
    }

    //mutators
    public void setName(String newName){
        this.name = newName;
    }
    public void setStu_id(String newID){
        this.name = newID;
    }
    public void setGPA(double newGPA){
        this.GPA = newGPA;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    //accessors
    public String getName(){
        return this.name;
    }
    public String getStu_id(){
        return this.stu_id;
    }
    public double getGPA(){
        return this.GPA;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
        String s = "";
        s+= "\nStudent Name: " + this.name;
        s+= "\nID number: " + this.stu_id;
        s+= "\nGPA: " + this.GPA;
        s+= "\nAge: " + this.age + "\n";
        return s;
    }
}
//class that includes a main method to run code
class CourseDriver{
    public static void main(String[] args) {
        Student[] listStudents1 = new Student[3];
        listStudents1[0] = new Student("Steven Len", "921HAK1", 3.7, 20);
        listStudents1[1] = new Student("Mark Luis", "HA2UI19", 3.2, 19);
        listStudents1[2] = new Student("John Ken", "YA3LS01", 2.8, 21);

        //first course
        Course c1 = new Course("Computer Programming II", "185", "Daffy Duck", listStudents1);
        System.out.println(c1.toString());

        //second course
        Student[] listStudents2 = new Student[3];
        listStudents2[0] = new Student("Luis Mark", "AIO10LA", 2.9, 20);
        listStudents2[1] = new Student("Kenneth Mar ", "HUA81KA", 3.8, 23);
        listStudents2[2] = new Student("Rock Lee", "JAK01AK", 3.5, 22);

        Course c2 = new Course("Computer Programming I", "125", "Bugs Bunny", listStudents2);
        System.out.println(c2.toString());





    }
}
