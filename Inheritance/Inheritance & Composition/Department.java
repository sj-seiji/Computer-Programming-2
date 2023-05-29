public class Department{
    private String deptName;
    private int numMajors;
    private Teacher[] listTeachers; //inherits from Person class
    private Student1 [] listStudents; //inherits from Person class

    //construct a department object(at least 2 constructors)
    public Department(){

    }
    //fully loaded constructors
    public Department(String deptN, int num, Teacher [] tList, Student1 [] sList){
        this.deptName = deptN;
        this.numMajors = num;
        this.listTeachers = new Teacher[tList.length];
            for(int i = 0; i < tList.length; i++){
                this.listTeachers[i] = new Teacher(tList[i]);
            }
        this.listStudents = new Student1[sList.length];
        for(int k = 0; k < sList.length; k++ ){
            this.listStudents[k] = new Student1(sList[k]);
        }
    }
    //accessor and mutators (one pair per each feature)
    //mutators
    public void setDeptName(String deptN) {
        this.deptName = deptN;
    }

    public void setNumMajors(int num) {
        this.numMajors = num;
    }
    public void setListTeachers(Teacher [] tList){
        this.listTeachers = new Teacher[tList.length];
        for(int k = 0; k < tList.length; k++){
            this.listTeachers[k] = new Teacher(tList[k]);
        }
    }
    public void setListStudents(Student1[] sList){
        for(int l = 0; l < sList.length; l++){
            this.listStudents[l] = new Student1(sList[l]);
        }
    }
    //accessors
    public String getDeptName() {
        return this.deptName;
    }

    public int getNumMajors() {
        return this.numMajors;
    }
    public Teacher [] getListTeachers(){
        Teacher [] temp = new Teacher[this.listTeachers.length];
            for(int m = 0; m < temp.length;m++){
                temp[m] = new Teacher(this.listTeachers[m]);
            }
            return temp;
    }
    public Student1 [] getListStudents(){
        Student1 [] temp = new Student1[this.listStudents.length];
        for(int y = 0; y < temp.length;y++){
            temp[y] = new Student1(this.listStudents[y]);
        }
        return temp;
    }
    //toString method
    public String toString(){
        String s = "";
        s += "\nDepartment Name: " + this.deptName;
        s += "\nNumber of Majors: " + this.numMajors;
        s += "\n\nList of Teacher in the system: ";

        for(int i= 0; i < this.listTeachers.length; i++) {
            s += "\nTeacher #" + (i + 1) + " Info: " + this.listTeachers[i].toString();
        }
        for(int j= 0; j < this.listStudents.length; j++){
            s += "\nStudent #" + (j + 1) + " Info: " + this.listStudents[j].toString();
        }
        return s;
    }
}
