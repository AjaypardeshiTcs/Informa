package Practice;

public class ArmStrong {
	public static void main(String[] args) {
		int num=154;
		int actnum=num;
		int r=0;
		int armnum=0;
		while(num>0) {
			r=num%10;
			armnum=r*r*r+armnum;
			num=num/10;
			
		}
		if(actnum==armnum) {
			System.out.println("given num is armstrong number");
		}
		else {
			System.out.println("given number is not armstrong number");
		}
	}
	

}
