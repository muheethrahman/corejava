class GoodMorning{
static int a=2,b=3,sum;

static void add(){
sum = a+b;

}
static int sub(){
sum = a-b;
return sum;
}
public static void main(String agrs[])
{
System.out.println(sum);
add();
System.out.println(sum);
sub();
System.out.println(sum);
}

}