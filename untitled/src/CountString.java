import java.util.Scanner;

public class CountString {
    //5.	WAP to enter any String and count total number of 'a' in that String

    public static void main(String[] args) {
        Scanner s = new Scanner( System.in );
        System.out.println("Enter any String");
        String str = s.nextLine();
        // initialize the Result of count =0
        int count =  0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt( i )=='a'|| str.charAt( i )=='A'){
            count++;}

        }
        System.out.println(" Enter String contain total number of (a) "+ count);
    }
}
