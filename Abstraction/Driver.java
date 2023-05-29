public class Driver {
    public static void main(String[] args) {
        //list of professors
        Professor p1 = new Professor(12000.00, 2);
        Professor p2 = new Professor(15400.00, 5);
        Professor p3 = new Professor(17300.00, 4);

        //list of ta
        TA ta1 = new TA(23000.00, 5, 2);
        TA ta2 = new TA(29000.00, 10, 3);
        TA ta3 = new TA(20000.00, 8, 1);

        //comparing Professors' salary to TAs'
        System.out.println("Comparison between Professors pay and TAs pay: ");
        System.out.println("Professor 1 has the same pay as TA 1: " + "\n" + p1.samePay(ta1));
        System.out.println("Professor 2 has the same pay as TA 2: " + "\n" + p2.samePay(ta2));
        System.out.println("Professor 3 has the same pay as TA 3: " + "\n" + p3.samePay(ta3));

        //comparing Professors days off to TAs
        System.out.println("\n\nComparison between Professors number of vacation and TAs number of vacation: ");
        System.out.println("Professor 1 has the same number of days off as TA 1: " + "\n" + p1.daysOff(ta1));
        System.out.println("Professor 1 has the same number of days off as TA 1: " + "\n" + p2.daysOff(ta2));
        System.out.println("Professor 1 has the same number of days off as TA 1: " + "\n" + p3.daysOff(ta3));






    }
}

