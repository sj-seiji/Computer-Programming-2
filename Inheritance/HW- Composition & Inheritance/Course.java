public class Course {
    private String course_name;
    private Professor instructor;
    private CollegeStudent [] students;

    //fully loaded constructor
    public Course(String cName, Professor p, CollegeStudent [] sList){
        this.course_name = cName;
        this.instructor = new Professor(p);
        this.students = new CollegeStudent[sList.length];
        for(int i=0; i < sList.length; i++){
            this.students[i] = new CollegeStudent(sList[i]);
        }
    }
    public Course(Course c){
        if(c == null){
            System.out.println("Invalid data input");
        }
        this.course_name = c.course_name;
        this.instructor = c.instructor;
        this.students = new CollegeStudent[c.students.length];
            for(int i =0; i < c.students.length; i++){
                this.students[i] = new CollegeStudent(c.students[i]);
            }
    }

    //mutator
    public void setCourse_name(String cName) {
        this.course_name = cName;
    }
    public void setInstructor(Professor instructor){
        this.instructor = new Professor(instructor);
    }
    public void setStudents(CollegeStudent [] sList){
        this.students = new CollegeStudent[sList.length];
        for(int j=0; j < sList.length; j++){
            this.students[j] = new CollegeStudent(sList[j]);
        }
    }
    //accessor
    public String getCourse_name() {
        return course_name;
    }
    public Professor getInstructor() {
        return new Professor(this.instructor);
    }
    public CollegeStudent [] getStudents(){
        CollegeStudent [] temp = new CollegeStudent[this.students.length];
        for(int k=0; k < temp.length; k++){
            temp[k] = new CollegeStudent(this.students[k]);
        }
        return temp;
    }
    //toString method
    public String toString(){
        String s = "";
        s += "\nCourse Name: " + this.course_name;
        s += "\nProfessor: " + this.instructor;
        s += "\nList of Students in the course: ";
        for(int i = 0; i < this.students.length; i++){
            s += "\n\n Student #" + (i + 1) + " Info: " + this.students[i].toString();
        }
        return s;
    }
}