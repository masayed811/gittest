import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        TimeTable timeTable = new TimeTable();
        timeTable.m1();
        timeTable.m1();
    }
    public void m1() {
        Scanner scanner = new Scanner( System.in );
        System.out.println( " Enter the number you want the time table " );
        int p = scanner.nextInt();
        for (int m = p; m <= p; m++) {
            for (int n = 1; n <= 10; n++) {
                System.out.println(
                        m + "x" + n + "= " + (m * n) );
            }
// Time table by start and end number

//          public static void main (String[]args){
//
//                Scanner s = new Scanner( System.in );
//                System.out.println( " Enter the number you want the time table " );
//                int a = s.nextInt();
//                System.out.println( " Enter start number " );
//                int b = s.nextInt();
//                System.out.println( " Enter your end number" );
//                int c = s.nextInt();
//
//                for (int i = a; i <= a; i++) {
//                    for (int j = b; j <= c; j++) {
//                        System.out.println(
//                                i + "x" + j + "= " + (i * j)
//                        );
//                    }
//                }
    //        }

        }}}