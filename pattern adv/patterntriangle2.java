package assign;

import java.util.Scanner;

public class patterntriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int row=1,col=1;
		int value=1;
		while(row<=N){
			col=1;
			while(col<=N-row){
				System.out.print("\t");
				col++;
			}
			value=row;
			col=1;
			while(col<=row){
				System.out.print(value+"\t");
				col++;
				value++;
			}
			col=1;
			value=value-1;
			while(col<=row-1){
				value--;
				System.out.print(value+"\t");
				
				col++;
				
			}
			System.out.println();
			row++;
		}
	/*	Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		
		int col=1;
		int m=1;
		for(int row=1;row<=N;row++){
			for(int z=1;z<=N-row;z++){
				System.out.print(" ");
				
			}
			m=row;
			for(int b=1;b<=row;b++){
				System.out.print(m +" ");
				m++;
			}
			m=m-1;
			for(int x=1;x<=row-1;x++){
				m--;
				System.out.print(m +" ");
			}
			System.out.println();*/
	}

}
