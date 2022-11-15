package August20;

public class marriage {
	public static void main(String[] args) {
		int boyage=16;
		int girlage=16;
		if(boyage>=21&&girlage>=18) {
			System.out.println("eligible for marriage");
		}
		else if(boyage>=21&& girlage<18) {
			System.out.println("boy is eligible but girl is not eligible for marriage ");
		}
		else if(girlage>=18&& boyage<21) {
			System.out.println("girl is eligible but boy is not eligible");
		}
		else{
			System.out.println("not eligible for marriage");
		}
	}

}
