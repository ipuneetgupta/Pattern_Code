package assigment_1;

import java.util.Scanner;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n,p,q;
	        Scanner scan=new Scanner(System.in);
	        n=scan.nextInt();
	        p=(n+1)/2-1;
	        q=p;
	        for(int i=0;i<n;i++)
	        {
	                        for(int j=0;j<n;j++)
	                        {
	                                                        if((j>=p) && (j<=q))
	                                                                        {System.out.print("*"+" ");}
	                                                        else
	                                                                        System.out.print(" ");
	                        }
	                        if(i>=(n+1)/2-1) {p++;q--;}
	                        else {p--;q++;}
	                        System.out.print("\n");
	        }

			

	}

}
