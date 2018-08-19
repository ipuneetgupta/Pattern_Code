package assign;

import java.util.Scanner;

public class patternstar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		
		int row=1;
		int col=1;
		int space=N-3;
		int star=1;
		while(row<=N){
			col=1;
			while(col<space){
				System.out.print("-");
				col++;
			}
			col=1;
			while(col<=star){
				System.out.print("*");
				col++;
			}
			if(row<=2){
				space--;
				star=star+2;
			}
			else{
				space++;
				star=star-2;
			}
			System.out.println();
			
			row++;
		}
	}

}
