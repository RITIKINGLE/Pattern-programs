/*
ABCDEDCBA
 ABCDCBA
  ABCBA
   ABA
    A    
*/

public class problem168{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++){
			for(int j=1; j<i; j++)
			   System.out.print(" ");

			for(int j=1; j<=n-i+1; j++)	
			   System.out.print((char)(j+64));
	
			for(int j=n-i; j>=1; j--)
			   System.out.print((char)(j+64));
			

			System.out.println();
		}
	}
}