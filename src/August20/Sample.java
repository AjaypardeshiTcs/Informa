package August20;

public class Sample {
	public static void main(String[] args) {
		System.out.println("start");
		Sample s=new Sample();
		s.m1();
		s.m2();
		System.out.println("end");
	}
      public void m1() {
    	  System.out.println("main m1");
    	  
      }
      public void m2() {
    	  System.out.println("main m2");
      }
}
