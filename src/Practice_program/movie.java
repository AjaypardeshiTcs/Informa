package Practice_program;

public class movie {
String movieName;
int noOfTimeSeen;
 
public movie(String movieName, int noOfTimeSeen) {
	this.movieName=movieName;
	this.noOfTimeSeen=noOfTimeSeen;
}
public void seen() {
	for(int i=1;i<=noOfTimeSeen;i++) {
		System.out.println("Bahubali in Cinemas");
	}
}

}
