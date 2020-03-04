public class Encap {

//Example for how we make encapsulation
//    public void m1(String name){
//        name="raj";
//        System.out.println(name);
//    }
//    public void m2(int balance ){
//
//        balance=9;
//        System.out.println(balance);
//    }
//
//    public static void main(String[] args) {
//        Encap e=new Encap();
//        e.m1( " bal" );
//        e.m2( 10 );
// out put----bal   10


private String name ;
    private int balance;
    public String getAccName(){
        return name;
    }
    public void setAccName(String name){
        this.name= name;

    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){

        this.balance=balance;

    }

    public static void main(String[] args) {
        Encap e=new Encap();
        e.setAccName( "muhammod" );
        e.setBalance( 1000000 );
        System.out.println(e.getAccName()+"       "+e.getBalance());
    }
    }


