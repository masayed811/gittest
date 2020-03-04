import java.util.Scanner;

public class Test1 {

    public static void main (String[]arg){
        System.out.println( "Insert the number"  );
      Scanner scanner=new Scanner( System.in );
        int a= scanner.nextInt();
        if ( a %2==0 )
        {
            System.out.println( "evenr"  );
        }
        else {
            System.out.println( "odd"  );
        }
    }
}
