package pattern;

public class halfpyramidnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pyaramid make using while loop
	/*	int row=1;
		int col=1;
		int N =5;
		while (row<=N){
			col=1;
			while(col<=row){
				System.out.print(col+" ");
				col++;
			}
			System.out.println();
			row++;
		}*/
		
		//half pyramid using for loop
		
		int row=5;
		for (int i=1;i<=row;i++){
			for (int j=1;j<=i;j++){
				System.out.print(j+" ");
				
				
			}
			System.out.println();
		}
				

	}

}
