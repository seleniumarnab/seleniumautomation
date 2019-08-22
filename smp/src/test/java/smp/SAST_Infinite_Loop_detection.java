package smp;

public class SAST_Infinite_Loop_detection {

	public static void main(String[] args) {
		
		//SAST_1_infinite loop detection 
		//vulnerable code or erroneous code below
		  
		  Boolean check=true;
		  while(check)
		  
		  { System.out.println("infinite");
		  
		  }
		 
		  
		for (int i=1;i<=3;i++) {
			
			System.out.println("Bug fix");
		}
	}

}
