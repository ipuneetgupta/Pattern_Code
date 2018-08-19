package pattern;

public class invertedfp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=5;i>=1;i--){
			for(int j=1;j<=row-i;j++){
				System.out.print(" ");
			}
			  
			for(int j=i; j<=2*i-1;j++){ /*for(int j=1;j<=row;j++){
			                                                      }*/
				System.out.print("* ");
			}
			for(int j=1;j<=i-1;j++){
				System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}
