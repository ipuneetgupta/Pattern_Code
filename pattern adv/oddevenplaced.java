package assign;

import java.util.Scanner;

public class oddevenplaced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int even=0;
		int odd=0;
		int r;
		for(int i=1;N!=0;i++){
			r=N%10;
					
			if(i%2==0){
				even=even+r;
			}
			else{
				odd=odd+r;
			}
			N=N/10;
		}
		System.out.println(even);
		System.out.println(odd);
     
	}

}
