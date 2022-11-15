package Practice_program;

public class Globalvariables {
 int i =10;//non static variable
 static int j=20;//static variable
 String hisFirstname="hello";
 
public static void main(String[] args) {
	Globalvariables f=new Globalvariables();
  System.out.println(f.i);
  System.out.println(j);
}
 static {
	 System.out.println("hello");
	 System.out.println("hiii Ajay");
	 
 }
 
 }

