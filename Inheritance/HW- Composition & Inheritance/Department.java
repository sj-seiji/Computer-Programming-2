public class Department {
    private Professor chair;
    private Professor[] faculty;
    private Course[] courses;

    public Department(Professor c, Professor[] p, Course[] co) {
        this.chair = new Professor(c);
        this.faculty = new Professor[p.length];
        // *
        for (int i = 0; i < p.length; i++) {
            this.faculty[i] = new Professor(p[i]);
        }
        this.courses = new Course[co.length];
        for (int j = 0; j < co.length; j++) {
            this.courses[j] = new Course(co[j]);
        }
    }
    public Department(){

    }
    //mutator and accessors
    public void setChair(Professor chair) {
        this.chair = new Professor(chair);
    }

    public Professor getChair() {
        return new Professor(this.chair);
    }

    public void setListFaculty(Professor[] faculty) {
        this.faculty = new Professor[faculty.length];
        for (int k = 0; k < faculty.length; k++) {
            this.faculty[k] = new Professor(faculty[k]);
        }
    }

    public Professor[] getListFaculty() {
        Professor[] temp = new Professor[this.faculty.length];
        for (int y = 0; y < temp.length; y++) {
            temp[y] = new Professor(this.faculty[y]);
        }
        return temp;
    }

    public void setListCourses(Course[] courses) {
        this.courses = new Course[courses.length];
        for (int l = 0; l < courses.length; l++) {
            this.courses[l] = new Course(courses[l]);
        }
    }

    public Course[] getListCourses() {
        Course[] temp = new Course[this.courses.length];
        for (int z = 0; z < temp.length; z++) {
            temp[z] = new Course(this.courses[z]);
        }
        return temp;
    }

    //toString method
    @Override
    public String toString() {
        String s = "Department Info: ";
        s += "\n\nChair of Department: " + this.chair + "\n\nList of Faculty:\n\n";
        for (int i = 0; i < this.faculty.length; i++) {
            s += "Faculty #" + (i + 1) + " Info: " + this.faculty[i].toString() + "\n";
        }
        s += "\nList of Courses:\n\n";
        for (int j = 0; j < this.courses.length; j++) {
            s += "\nCourse #" + (j + 1) + " Info: " + this.courses[j].toString() + "\n";
        }
        return s;
    }

}