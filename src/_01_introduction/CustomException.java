package _01_introduction;

public class CustomException extends Exception{
	
	public static void terminate() {
		System.out.println("terminated");
		System.exit(0);
	}
}
