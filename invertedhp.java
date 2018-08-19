package pattern;

public class invertedhp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inverted pyramid using while loop
	/*	int row=1;
		int col=1;
		int N=6;
		while(row<=N){
			col=1;
			while(6-col>=row){
				System.out.print("* ");
				col++;
				
			}
			System.out.println();
			row++;
		}*/
            
		//inverted pyramid using for loop
		/*int row=6;
		for(int i=1; i<=6; i++) {
			for(int j=1; 6-j>=i; j++){
				System.out.print("* ");
			}
		System.out.println();
		}*/
		
		//another method for making hp by using for loop
		
		int row=5;
		for (int i=row; i>=1;i--){
			for (int j=1; j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
