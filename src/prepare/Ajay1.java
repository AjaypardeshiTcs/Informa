package prepare;

import java.util.Scanner;

public class Ajay1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		if (num%2==0) {
			System.out.println("given number is even");
		}
		else {
			System.out.println("given number is odd number");
		}
	}

}
