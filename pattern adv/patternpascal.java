package assign;

import java.util.Scanner;

public class patternpascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
	     int N=scn.nextInt(); 
	     int num=1;
	     for(int i=0;i<N;i++){
	    	 for(int j=0;j<=i;j++){
	    		 if(i == 0 || j == 0)
	    			 num=1;
	    		 
	    		 else
	    			 num=num*(i-j+1)/j;
	    		 
	    		 System.out.print(num+"\t");
	    	 }
System.out.println();
	     }
		
		

	}

}
