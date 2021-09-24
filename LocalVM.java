class LocalVM{
static String name="Globle";//we can access it all over class

public static void main(String args[]){
String gender="male";//this local variable
System.out.println("this globel variable we can access it ="+name);
System.out.println("this local variable we can access it inside metho only ="+gender);
second();
System.out.println("this localvariable we can access it ="+father);
}
static void second(){
String father ="gowda";//local variable
System.out.println("this is Second Method");
System.out.println("this globel variable we can access it=="+name);
System.out.println("this local variable we can access it ="+father);
}
}
