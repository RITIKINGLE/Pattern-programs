/*
*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *
*/

public class program200{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j>1; j--)
				   System.out.print(" ");

				for(int j=1; j<=n-i+1; j++)
				   System.out.print((j==1)?"*":" ");

				for(int j=n-i; j>=1; j--)
				   System.out.print((j==1)?"*":" ");
			}
			else{
				for(int j=i; j<(n*2)-1; j++)
				   System.out.print(" ");

				for(int j=1; j<=i-n+1; j++)
				   System.out.print((j==1)?"*":" ");

				for(int j=i-n; j>=1; j--)
				   System.out.print((j==1)?"*":" ");
			}

			System.out.println();
		}
	}
}