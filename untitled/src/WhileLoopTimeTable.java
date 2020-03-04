import java.util.Scanner;

public class WhileLoopTimeTable {
    public static void main(String[] args) {
        Scanner s= new Scanner( System.in );
        System.out.println(" Enter which time table you want by while loop --: ");
        int n = s.nextInt();
int i = 1;
        do {
            System.out.println(n +"X "+ i + " = "+ n  * i );
            i++;

        }
        while (i<=12);
    }
}
