import java.util.Scanner;

public class LowerCaseUperCase {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        System.out.println( "Enter CASE to change " );
        char ch = s.next().charAt( 0 );
        //char d= Character.toLowerCase( ch );
        // if (ch=Character.)
        char changecase = Character.toLowerCase( ch );

        char c = Character.toUpperCase( ch );
        if (ch != changecase) {
            System.out.println( changecase );

        } else {
            System.out.println( c );
        }
    }}