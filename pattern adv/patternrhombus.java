package assign;

import java.util.Scanner;

public class patternrhombus {

	public static void main(String[] args) {
		// TODO Auto-generated   
		Scanner scn=new Scanner(System.in);
	     int N=scn.nextInt(); 
	     int row=1;
	     int col=1;
	     int num=1;
	     int space=N-1;
	     int p=0;
	     while(row<=2*N-1){
	    	 col=1;
	    	 while(col<=space){
	    		 System.out.print("\t");
	    		 col++;
	    	 }
	    	 col=1;
	    	 while(col<=row){
	    		 System.out.print(num+"\t");
	    		 num++;
	    		 col++;
	    	 }
	    	 
	    	if(row>=N){
	    		space=space+1;}
	    	
	    	if(row!=1){
	    			num--;
	    		}
	    	col=1;
	    	 while(col<=p){
	    		 num--;
	    		 System.out.print(num+"\t");
	    		 col++;
	    	 }
	    	 
	    	 if(row!=1){
	    		 num++;
	    	 }
	    	 if(row>N){
	    		 p--;
	    		 num=num-2;
	    	 }
	    	 System.out.println();
	    	 row++;
	    	if(row<=N){p++;
	    		space--;}
	     }
		
		

	}

}
