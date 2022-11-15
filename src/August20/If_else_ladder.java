package August20;

public class If_else_ladder {
	public static void main(String[] args) {
		int marks=80;
		if(marks>=75) {
			System.out.println("pass with first class and distinction");
		}
		else if (marks>=60) {
			System.out.println("pass in first class");
			
		}
		else if(marks>=50) {
			System.out.println("pass in second class");
		}
		else if(marks>=40) {
			System.out.println("pass");
			
		}
		else if(marks>=35) {
			System.out.println("just pass");
		}
		
		else {
			System.out.println("fail");
		}
		
	}

}
