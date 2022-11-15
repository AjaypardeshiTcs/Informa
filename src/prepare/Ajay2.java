package prepare;

import java.util.Scanner;

public class Ajay2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string who have special char ");
		  String name=s.next();
		String correctname=name.replace("@","J");
		System.out.println(correctname);
	}

}
