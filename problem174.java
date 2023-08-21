/*
    5
   454
  34543
 2345432
123454321         
*/

public class problem174{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++){
			for(int j=i; j<n; j++)
			   System.out.print(" ");

			for(int j=n-i+1; j<=n; j++)	
			   System.out.print(j);
	
			for(int j=n-1; j>n-i; j--)
			   System.out.print(j);
			

			System.out.println();
		}
	}
}