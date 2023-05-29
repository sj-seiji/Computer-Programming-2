public class DepartmentDriver{
    public static void main(String[] args) {
        //1st Department with 5 students and 3 teachers

        //Student list
        Student1[] sList = new Student1[5];
        sList[0] = new Student1("Luis Mark", true, 21, "712-0192-821","4921923", 2.9, "C");
        sList[1] = new Student1("Kenneth Mar ", true, 24, "192-3521-124", "4828812", 3.8, "B");
        sList[2] = new Student1("Rock Lee", true, 19, "611-2142-512", "2178192", 3.5, "A");
        sList[3] = new Student1("Sophia Ardevela ", true, 22, "131-9132-122", "8129921", 2.7, "C");
        sList[4] = new Student1("Yna Maya", true, 29, "193-5391-912", "4821152", 3.1, "B");

        //Teacher list
        Teacher[] tList = new Teacher[3];
        tList[0] = new Teacher("Eroa Reyes", true, 48, "123-4111-521","214819", 141000.00, 10);
        tList[1] = new Teacher("Stephen Serdon ",true, 62, "241-412=412", "112831", 175000.00, 34);
        tList[2] = new Teacher("Lee Nelson", true, 55, "614-8331-8320", "339201", 156000.00, 20);

        //print out
        Department d1 = new Department("Science Department", 8, tList, sList);
        System.out.println(d1);

        //2nd department with 5 students and 3 teachers

        //Student list
        Student1[] sList1 = new Student1[5];
        sList1[0] = new Student1("Steve Jones", true, 20, "252-2122-753","1819010", 2.9, "C");
        sList1[1] = new Student1("Rome Yana", true, 22, "864-5211-311", "192010", 3.8, "A");
        sList1[2] = new Student1("Randy Stones", true,19, "313-8954-432", "2172001", 3.5, "A");
        sList1[3] = new Student1("Rachel Nuyad ", true, 18, "233-9865-537", "3192012", 2.7, "C");
        sList1[4] = new Student1("Toby Ryan", true, 21, "642-5732-823", "281031", 3.1, "A");

        //Teacher List
        Teacher[] tList1 = new Teacher[3];
        tList1[0] = new Teacher("Brent Noscal", true, 51, "921-4212-462","7202192", 158000.00, 27);
        tList1[1] = new Teacher("Alex Toma ", true, 64, "711-932=102", "284910", 195000.00, 37);
        tList1[2] = new Teacher("Leon Serdon", true, 43, "090-4522-211", "1271025", 126000.00, 12);

        //print out
        Department d2 = new Department("Engineering Department", 8, tList1, sList1);
        System.out.println(d1);

    }
}
