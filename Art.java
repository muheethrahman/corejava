class Art{
static int a=10;
static int b=2;
static int sum;

static int add(){
  sum =a+b;
return sum;
}
static int sub(){
int sum=a-b;

return sum;
}
public static void main(String args[]){
add();   
sub();
System.out.println("sum of two numbers"+sum);
System.out.println("sub of tow number"+sum);


}




}
