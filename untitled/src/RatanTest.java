public class RatanTest {

    int a = 7;
    int b = 8;
    static int d = 500;
    static double e = 70.77;

     boolean k=true ;
    public static void main(String[] args) {
        RatanTest t = new RatanTest();
        t.m1();
        RatanTest.m2();

        int x=5;
        x++;
        System.out.println(x);  //6
        int y=5;
        y--;
        System.out.println(y);  //4
        int   z=5;
        ++z;
        System.out.println(z); //6

        int p=5;
        --p;
        System.out.println(p); //4

        int m = 10;
        int n = ++m;  // produce m is 11, n is 11
        System.out.println(n);
        System.out.println(m);

        int s = 20;
        int r = s++;
        System.out.println(r);// produce s is 12, but r is 13 ,
        System.out.println(s);    //z gets the value of x and then x is incremented.

    }

    void m1() {
        System.out.println( a );
        System.out.println( b );
        System.out.println( RatanTest.d );
        System.out.println( RatanTest.e );
    }


    static void m2() {
        RatanTest t = new RatanTest();
        System.out.println( t.a );
        System.out.println( t.b );
        System.out.println( RatanTest.d );
        System.out.println( RatanTest.e );
        System.out.println( t.k );

    }

}


