package pattern;

public class fullpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int row= 5;
      for (int i=1;i<=row;i++){
    	  for(int j=1;j<=row-i;j++){
    		  System.out.print(" ");
    		  
    	  }
    	  
    	  for(int j=1;j<=i;j++){
    		  System.out.print("* ");
    	  }
    	  for(int j=1;j<=i-1;j++){
    		  System.out.print("* ");
    	  }
    	  
    	System.out.println();  
      }
    		 
	}

}
