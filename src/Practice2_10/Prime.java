package Practice2_10;

public class Prime {
	public static void main(String[] args) {
		int num=6;
		int count=0;
		for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
		}
		if(count==2) {
			System.out.println("Num is prime");
		}
		else {
			System.out.println("Num is not prime");
		}
	}

}
