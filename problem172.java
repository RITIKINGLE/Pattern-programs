/*
    5
   545
  54345
 5432345
543212345     
*/

public class problem172{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++){
			for(int j=i; j<n; j++)
			   System.out.print(" ");

			for(int j=n; j>=n-i+1; j--)	
			   System.out.print(j);
	
			for(int j=n-i+2; j<=n; j++)
			   System.out.print(j);
			

			System.out.println();
		}
	}
}