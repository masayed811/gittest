import java.util.Scanner;

public class FurformBysymbol {

//    WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition, subtraction,
//    multiplication and division according to their symbol (using if else)

    public static void main(String[] args) {

        System.out.println( "Enter 1st number" );
        Scanner s = new Scanner( System.in );
        int a = s.nextInt();
        System.out.println( "Enter 2st number" );
        int a2 = s.nextInt();
        System.out.println( "Enter Symbol " );
        char c = s.next().charAt( 0 );
        if (c == '+') {
            System.out.println( a+"+"+a2+"=" +( a + a2) );
        } else if (c == '-') {
            System.out.println( a+"-"+a2+"=" + (a - a2) );
        }
        else if (c == '/'){System.out.println( a+"%"+a2+"=" + (a/a2) );}
        else if (c == '*'){System.out.println( a+"x"+a2+"=" + (a*a2) );}
    }}
