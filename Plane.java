class Plane{
static String src_name="Bangalore";
static String des_name="NYA";
static double price=25000.00;
static void planeName(){
String PName="JetAirways";
System.out.println("Name of the plane"+PName);
}
static void classes(){
String classs="Business";
System.out.println("Class in plane"+classs);
}
static void food(){
boolean food=true;
System.out.println("We provied food"+food);
}
public static void main(String args[])
{
System.out.println("Source Name:"+src_name);
System.out.println("Destination Name:"+des_name);
System.out.println("Cost of the ticket:"+price);
planeName();
classes();
food();
}
}