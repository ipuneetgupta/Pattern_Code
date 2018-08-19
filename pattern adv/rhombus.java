package assigment_1;

import java.util.Scanner;

public class rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		int c=1;
		for ( i=1;i<=n;i++)
			
		{
			for (j=n;j>i;j--)
			{
				System.out.print("\t");
			}
			c=i;
			for (j=1;j<=i;j++)
			{
				System.out.print(c+"\t");
				c++;
			}
			c=c-2;
			for (j=1;j<i;j++)
			{
				System.out.print(c+"\t");
				c--;
			}
			System.out.println();
		}

	}

}
