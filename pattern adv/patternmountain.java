package assign;

import java.util.Scanner;

public class patternmountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int row=1;
		int col=1;
		int space=0;
		int num=1;
		while(row<=N){
			col=1;
			num=1;
			while(col<=row){
				System.out.print(num+"\t");
				col++;
				num++;
			}
			
			col=1;
			while(col<(2*N-2)-space){
				System.out.print("\t");
				col++;
			}
            space=space+2;
			
			if(row==N){
				num=num-1;
				col=2;
				}
			else{
				col=1;
			}
			
			while(col<=row){
			num--;
			System.out.print(num+"\t" );
			col++;
            }

			
			System.out.println();
			row++;
		}

	}

}
