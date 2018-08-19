package pattern;

public class sympattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=5;
		int row=1;
		int col=1;
		int space=0;
		int star=5;
		while(row<=2*N-1){
			col=1;
			while(col<=space){
				System.out.print(" ");
				col++;
			}
			col=1;
			while(col<=star){
				System.out.print("*");
				col++;
			}
			if(row<N){
				space=space+2;
				star--;
			}
			else{
				space=space-2;
				star++;
			}
			System.out.println();
			
			row++;
			
		}

	}

}
