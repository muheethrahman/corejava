class Demo3{
static void methodCh1(){
System.out.println("this method one");
methodCh2();
}
static void methodCh2(){
System.out.println("this method two");
methodCh3();
}
static void methodCh3(){
System.out.println("this method three");

}
public static void main(String args[])
{
methodCh1();
}
}
