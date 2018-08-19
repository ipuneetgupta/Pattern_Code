package assign;

import java.util.Scanner;

public class ckprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     int N=scn.nextInt();
     boolean flag=true;
     for(int i=2;i<N;i++){
    	int rem;
    	 rem=N%i;
    	 if(rem==0){
    		 flag=false;
    		 
    	 }
    	 
     }
     if(flag==true)
     { System.out.println("Prime");
	}
	else{
		System.out.println("Not Prime");
	}
		
	}

}
