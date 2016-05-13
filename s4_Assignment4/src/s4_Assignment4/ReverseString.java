package s4_Assignment4;

public class ReverseString {
	public static void main(String[] args) {
		
		String str = "Java";
	    String reverseStr = reverseRecurive(str);
		System.out.println("Normal String is : " + str + " \nReverse String is : "+reverseStr);    
	}
		 public static String reverseRecurive(String str) {
	if (str.length() <= 1) {
		 return str;
		}
	return reverseRecurive(str.substring(1)) + str.charAt(0);
	 }		
}