package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public static double divide(double nom, double denom)throws IllegalArgumentException{
		if(denom==0) {
			throw new IllegalArgumentException("Stupid");
		}
		double qouteint=nom/denom;
		
		return qouteint;
	}
	public static String reverseString(String str)throws IllegalStateException {
		if(str.contentEquals("")) {
			throw new IllegalStateException("Joey");
		}
		String export = "";
		for (int i = str.length()-1; i >0; i--) {
			export = export + str.charAt(i);
		}
		return export;
	}
}
