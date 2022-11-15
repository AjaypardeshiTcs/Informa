package Logicalprogram;

public class Test4 {
	public static void main(String[] args) {
		String name="AJ@$A$Y";
		String correctname=name.replaceAll("[^a-zA-Z]", "");
		System.out.println(correctname);
	}

}
