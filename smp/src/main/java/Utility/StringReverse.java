package Utility;

public class StringReverse {

	
	public static void main(String[] args) {
		
		String s="String";
	    char[] c= s.toCharArray();
	    
	    
	    //string reverse
	    for (int i=c.length-1;i>=0;i--) {
			
			System.out.println("Reverse of string is:" +c[i]);
		}
	    
	   
	   //string length
       System.out.println("\nString length is" +c.length+"\n");
	    
	    
       //string to character array print
	    for (int i=0;i<=c.length-1;i++) {
			
			System.out.println("String to character" +c[i]);
		}

	}

}
