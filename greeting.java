package java_practice;

public class greeting {

	public static void main(String []args) {
		
		greeting();
		String greet=greet("kiruthika");
		System.out.println(greet);
		
	}
	
	
	static void greeting() {
		System.out.println("Hello");
	}
	
	
	static String greet(String name) {
		 String message="hey "+name +". How are you?";
		 return message;
	}
}
