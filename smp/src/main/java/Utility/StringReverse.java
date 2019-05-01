package Utility;

public class StringReverse {

	public static void main(String[] args) {
		
		String s="String";
		int k= s.length();
		int i=k;
		
		char[] c= s.toCharArray();
		//System.out.println(i);
	
		for (i=k;i>0;i--) {
			
			System.out.println(c[i]);
		}
		

	}

}
