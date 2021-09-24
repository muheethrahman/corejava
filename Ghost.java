class Ghost{
void Ghost(){
//default constructor
System.out.println("this default constructor");
}
void Ghost(String name){
//paramenter constructor
System.out.println("this parameter constructor ghost name is :"+name);
}
public static void main(String[] args)
{
Ghost obj1=new Ghost();
Ghost ghost=new Ghost();
obj1.Ghost();
obj2.Ghost("yakshini");
}
}
