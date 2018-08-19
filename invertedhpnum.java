package pattern;

public class invertedhpnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*int row=5;
		for (int i=row; i>=1;i--){
		     for (int j=1; j<=i;j++){
		    	 System.out.print(j+" ");
		     }
		     System.out.println();
		}*/
        
	/*	int row=5;
		int col=1;
		int N=1;
		while(row>=N){
			col=1;
			while(col<=row){
				System.out.print(col +" ");
				col++;
		}
		System.out.println();
		row--;} */
		
	/*	int row=5;
		int col=5;
		int N=1;
		while(row>=N) {
			col=5;
			while(col>=6-row){
				System.out.print(col + " ");
				col--;
			}
			System.out.println();
			row--;
			
		} */
		//reverse and inverted half pyramid using for loop
		int row=5;
		for (int i=1; i<=row; i++){
			for (int j=5; j>=i; j--){
				System.out.print(j +" ");
			}
			System.out.println();
			
		}
		   
		
	}

	}
