import java.util.Scanner;

public class VoileOrConsonantUperCaseToLower {
    public static void main(String[] args) {

        System.out.println(" Enter any  single character to Print Vowel or Consonant ......: ");
        Scanner s= new Scanner( System.in );
        char c = s.next().charAt( 0 );
      char d= Character.toLowerCase( c );
        if(c== 'a'|| c=='e'||c=='i'||c=='o'||c=='u' )
        {
            System.out.println("it is vowel");

        }
        else if(d== 'a'|| d=='e'||d=='i'||d=='o'||d=='u' ) {


            System.out.println( d    + "   "+  "it is vowel");

        }
        else {

            System.out.println(d    + "   "+"it is consonant");
        }
    }
}