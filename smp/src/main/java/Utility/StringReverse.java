package Utility;

public class StringReverse {

	public static void main(String[] args) {
		
		String s="String";
	    char[] c= s.toCharArray();
	    int a= c.length;
		//System.out.println(a);
	
		for (int i=a-1;i>=0;i--) {
			
			System.out.println(c[i]);
		}
		

	}

}
