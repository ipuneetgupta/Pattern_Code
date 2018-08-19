package pattern;


import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int t1=0,t2=1,sum=0;
		int row=1;
		int col=1;

		
		while(row<=N){
			col=1;
			while(col<=row){
				System.out.print(t1+" ");
				sum=t1+t2;
				t1=t2;
				t2=sum;
				col++;
			}
System.out.println();
			
			
			row++;
		}
		
		
	   
	         
	}

}
