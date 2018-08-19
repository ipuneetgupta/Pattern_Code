package assign;

import java.util.Scanner;

public class hollowdiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		 int space=0;
	        for(int i=N; i>=1; i--)
	        {
	           
	            for(int j=i; j>=1; j--)
	                System.out.print("*");
	             
	            
	            for(int j=1;j<=space; j++)
	                System.out.print(" ");
	                 
	            if(i==1){
	            	j=i-1;
	            }
	            for(int j=i; j>=1; j--)
	            	
	                System.out.print("*");
	            System.out.println();   
	            space=space+2;          
	        }
	         
	        space=2*N-2;
	        for(int i=1; i<=N; i++)
	        {
	            for(int j=1; j<=i; j++)
	                System.out.print("*");
	             
	            for(int j=1;j<=space; j++)
	                System.out.print(" ");
	                 
	            for(int j=1; j<=i; j++)
	                System.out.print("*");
	             
	            System.out.println();   
	            space=space-2;
	        }
	}

}
