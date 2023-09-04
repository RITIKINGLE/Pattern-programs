/*
123454321
 2345432
  34543
   454
    5
   454
  34543
 2345432
123454321
*/

public class program201{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j>1; j--)
				   System.out.print(" ");

				for(int j=i; j<=n; j++)
				   System.out.print(j);

				for(int j=n-1; j>=i; j--)
				   System.out.print(j);
			}
			else{
				for(int j=i; j<(n*2)-1; j++)
				   System.out.print(" ");

				for(int j=(n*2)-i; j<=n; j++)
				   System.out.print(j);

				for(int j=n-1; j>=(n*2)-i; j--)
				   System.out.print(j);
			}

			System.out.println();
		}
	}
}