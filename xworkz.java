class xworkz{
static String courseName="java";
static int durCourse=5;
static double courseFee=25000.00;

static void location(){
String location="BTM LAYOUT";
System.out.println("COURSE IN LOCATION :"+location);
System.out.println("COURSE NAME :"+courseName);
System.out.println("COURSE DURATION :"+durCourse);
System.out.println("COURSE FEES :"+courseFee);
System.out.println();
}

static void trainer(){
String t_name="Omkar";
System.out.println("Trainer Name is :"+t_name);
System.out.println("COURSE NAME :"+courseName);
System.out.println("COURSE DURATION :"+durCourse);
System.out.println("COURSE FEES :"+courseFee);
System.out.println();
System.out.println("COURSE IN LOCATION :"+location);
}
public static void main(String args[])
{
System.out.println("COURSE NAME :"+courseName);
System.out.println("COURSE DURATION :"+durCourse);
System.out.println("COURSE FEES :"+courseFee);
System.out.println();
location();
System.out.println();
trainer();
}
}