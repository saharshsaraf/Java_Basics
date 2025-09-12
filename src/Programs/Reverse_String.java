package Programs;

public class Reverse_String {
	
	
	    public static void main(String[] args) {
	        String original = "HelloWorld";
	        
	        // Using StringBuilder to reverse the string
	        String reversed = new StringBuilder(original).reverse().toString();
	        
	        System.out.println("Original String: " + original);
	        System.out.println("Reversed String: " + reversed);
	    }
	}



