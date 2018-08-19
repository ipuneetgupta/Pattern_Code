package pattern;

public class halfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//half pyaramid using while loop
		
		int row=1;
		int col=1;
		int N=5;
		while(row<=N){
			col=1;  //because the  value change after when one loop complete so col=1 help to gain intiale code
			while(col<=row){
				System.out.print("*\t");
				col++;
			}
			System.out.println();
			row++;
			
		}

	}

}
/*package pattern;

public class halfpyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 half pyramid using for loop
		 
		int row =5;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
*/