/*
    E
   DED
  CDEDC
 BCDEDCB
ABCDEDCBA  
*/

public class problem171{
	public static voidx main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++){
			for(int j=i; j<n; j++)
			   System.out.print(" ");

			for(int j=n-i+1; j<=n; j++)	
			   System.out.print((char)(j+64));
	
			for(int j=n-1; j>n-i; j--)
			   System.out.print((char)(j+64));
			

			System.out.println();
		}
	}
}