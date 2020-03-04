import java.util.Scanner;

public class ArryEmployee {
    int id;
    String name;
    double salary;

    public void Emp() {
        Scanner s = new Scanner( System.in );
        System.out.println( "\n\tEnter employee ID  : " );
        id = Integer.parseInt( s.nextLine() );

        System.out.println( "\n\tEnteremployee Name  : " );
        name = s.nextLine();

        System.out.println( "\n\tEnteremployee salary  : " );
        salary = Integer.parseInt( s.nextLine() );

    }

    public void putdata() {
        System.out.println( "\n\t" + id + "\t" + name + "\t" + salary );
    }

    public static void main(String[] args) {

        ArryEmployee[] e = new ArryEmployee[5];
        int i;
        for (i = 0; i < 5; i++)
            e[i] = new ArryEmployee();
        for (i = 0; i < 5; i++) {

                       e[i].Emp();
        }
        System.out.println( "Enetr details of employeed :   " );
        for (i = 0; i < 5; i++) {

                e[i].putdata();


            }

        }
    }

