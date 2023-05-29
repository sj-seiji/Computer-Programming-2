import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        //roster for the first department

        //list of faculty members
        Professor[] faculty = new Professor[3];
        faculty[0] = new Professor("John", true, 50, "757575765", "27688", 130000, 16, "Embedded systems", "Digital Circuits", "Professor", true);
        faculty[1] = new Professor("Mike", true, 45, "897990898", "87338", 150000, 17, "Computer Science", "Creating Apps", "Professor", true);
        faculty[2] = new Professor("David", true, 43, "989878667", "22346", 140000, 6, "Artificial Intelligence", "Robotics", "Research Assistant", true);

        Professor[] faculty1 = new Professor[3];
        faculty1[0] = new Professor("Romeo", true, 60, "816377728", "42124", 147000, 31, "Genetics", "Disease oriented", "Professor", true);
        faculty1[1] = new Professor("Sebastian", true, 55, "420102000", "43132", 155000, 25, "Biochemistry", "Cancer Biology and Pathology", "Professor", true);
        faculty1[2] = new Professor("Leonardo", true, 63, "234281829", "64231", 170000, 35, "Physics", "Robotics", "Computational Physics", true);

        //student roster
        CollegeStudent[] collegeStudent = new CollegeStudent[4];
        collegeStudent[0] = new CollegeStudent("Kranthi", true, 29, "834788739", "123456", 3.99, "Architecture", "A");
        collegeStudent[1] = new CollegeStudent("Kumar", true, 28, "834788738", "123457", 3.98, "Architecture", "A");
        collegeStudent[2] = new CollegeStudent("Seiji", true, 19, "544672098", "67877", 3.78, "Computer Science", "A" );
        collegeStudent[3] = new CollegeStudent("Tom", true, 18, "989097531", "35435", 3.88, "Information Technology", "B");
        //
        CollegeStudent[] collegeStudent2 = new CollegeStudent[4];
        collegeStudent2[0] = new CollegeStudent("Varshini", true, 20, "819201821", "31112", 3.78, "Biochemistry", "A" );
        collegeStudent2[1] = new CollegeStudent("Tom", true, 18, "491928327", "98765", 3.58, "Biomedical Engineering", "B");
        collegeStudent2[2] = new CollegeStudent("Seiji", true, 19, "544672098", "67877", 3.78, "Computer Science", "B" );
        collegeStudent2[3] = new CollegeStudent("Tom", true, 18, "989097531", "35435", 3.88, "Information Technology", "A");
        //
        CollegeStudent[] collegeStudent3 = new CollegeStudent[4];
        collegeStudent3[0] = new CollegeStudent("Ansha", true, 21, "818291829", "78754", 3.98, "Electrical Engineering", "A" );
        collegeStudent3[1] = new CollegeStudent("Alexis", true, 26, "421920102", "24124", 3.38, " Biomedical Engineering", "B");
        collegeStudent3[2] = new CollegeStudent("Seiji", true, 19, "544672098", "67877", 3.78, "Computer Science", "B" );
        collegeStudent3[3] = new CollegeStudent("Tom", true, 18, "989097531", "35435", 3.88, "Information Technology", "A");



        //courses
        Course[] courses = new Course[3];
        courses[0] = new Course("Computer Architecture and Organization", faculty[0], collegeStudent);
        courses[1] = new Course("Computer Science 185", faculty[1], collegeStudent3);
        courses[2] = new Course("Digital Logics", faculty[2], collegeStudent);
        //
        Course[] courses1 = new Course[3];
        courses[0] = new Course("Biology", faculty1[0], collegeStudent2);
        courses[1] = new Course("Physics", faculty1[1], collegeStudent3);
        courses[2] = new Course("Chemistry", faculty1[2], collegeStudent2);


        Department[] departments = new Department[2];
        departments[0] = new Department(faculty[0], faculty, courses);
        departments[1] = new Department(faculty1[1], faculty1, courses1);

        //print out
        for( Department d: departments){
            System.out.println(d);
        }

    }
}
