package assigment_1;

import java.util.Scanner;

public class mirror_star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int i,j;
		for (i=1;i<=(n+1)/2;i++)
		{
			for (j=1;j<=((n+1)/(2))-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*\t");
			}
			for (j=1;j<=i-1;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
		for (i=n/2;i>=1;i--)
		{
			for (j=0;j<=((n/2)-i);j++)
			{
				System.out.print(" ");
			}
			for (j=1;j<=i;j++)
			{
				System.out.print("*\t");
			}
		    for (j=1;j<=i-1;j++)
		    {
			    System.out.print("*\t");
		    }
		    System.out.println();
		}
		
	}

}
