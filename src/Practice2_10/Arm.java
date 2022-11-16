package Practice2_10;

public class Arm {
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
			System.out.println("Num is Armstrong");
			System.out.println("hii"):
		}
		else {
			System.out.println("Num is not Armstrong");
		}
	}

}
