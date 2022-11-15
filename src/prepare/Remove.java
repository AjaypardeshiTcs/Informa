package prepare;

public class Remove {
	public static void main(String[] args) {
		String name="A@&J@A$Y";
		String correctname=name.replaceAll("[^a-zA-Z]", "");
		System.out.println(correctname);
	}

}
