 class Hospital{
 static String god= "Kali";//global variable
 public static void main(String args[]){

  covidWard("Yakshini",666,true);
  localEx("Demon",999,false);

  }
  static void covidWard(String name,int reg_no,boolean f_report){
    
    System.out.println("name of the Ghost>"+name);
    System.out.println("id of the Ghost>"+reg_no);
    System.out.println("Is Its A ghost< * ^ * >"+f_report);
    System.out.println("This is god:"+god+"\n");

}
static void localEx(String name,int reg_no,boolean f_report){
    
    System.out.println("name of the Ghost>"+name);
    System.out.println("id of the Ghost>"+reg_no);
    System.out.println("Is Its A ghost< * ^ * >"+f_report);
    System.out.println("This is god:"+god);

}
  

}