import java.util.Scanner;

public class SwitchDays {


        public static void main (String[]args){
            SwitchDays w =new SwitchDays();
            Scanner s = new Scanner( System.in );
            System.out.println( " Enter the day of week for print " );

            int day = s.nextInt();
            //String Day;
            switch (day) {
                case 1:
                    System.out.println( "Monday" );
                    break;
                case 2:
                    System.out.println( "Tusday" );
                    break;
                case 3:
                    System.out.println( "Wednesday" );
                    break;
                case 4:
                    System.out.println( "Thrusday" );
                    break;
                case 5:
                    System.out.println( "Friday" );
                    break;
                case 6:
                    System.out.println( "Saturday" );
                    break;
                case 7:
                    System.out.println( "Sunday" );
                    break;
                default:
                    System.out.println( "Invalid number input for day" );

            }

            }
            }



