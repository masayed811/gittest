import java.util.Scanner;

public class ClassNumberPassFailByParsentage {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        // student name
        System.out.println( " Enter student name " );
        String name = s.next();
        //student number
        System.out.println( " Enter student Roll no " );
        int rollNumber = s.nextInt();
        //Math marks
        System.out.println( " Enter Math Marks " );
        int MathMark = s.nextInt();
        // english marks
        System.out.println( " Enter English Marks " );
        int EnglishMaks = s.nextInt();
        //Physics marks
        System.out.println( " Enter Physics  Marks " );
        int physicsMark = s.nextInt();

        // parsentage of total marks
        int total = MathMark + EnglishMaks + physicsMark;
        System.out.println( "Total mark  " + "= " + - -total );
        // parsentage of marks
        int percentage = total / 3;
        System.out.println( "percentage of mark  " + "= " + - -percentage );
        if (percentage >= 35) {
            System.out.println( "Pass" );
        } else {
            System.out.println( "Fail" );
        }

    }
}
