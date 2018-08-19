package pattern;

public class patternnumfp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int row=5;
       int a=1;
       int b=1;
       for(int i=1;i<=row;i++){
    	   for(int j=1;j<=row-i;j++){
    		   System.out.print(" ");
    	   }
    	     a=i;
    	   for(int j=1;j<=i;j++){
    		    
    		 
    		   System.out.print(a +" ");
    		   a++;
    	   }
    	      
    	   a=a-2;
    	   for(int j=1;j<=i-1;j++){
    		   
    		   
    		   System.out.print(a +" ");
    		   a++;
    	   }
    	   System.out.println();
       }
	}

}
