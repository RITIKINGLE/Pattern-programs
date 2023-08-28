/*
543212345
 4321234
  32123
   212
    1
*/

public class program183{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j>1; j--)
			   System.out.print(" ");

			for(int j=n-i+1; j>=1; j--)
			   System.out.print(j);

			for(int j=2; j<=n-i+1; j++)
			   System.out.print(j);
	
			System.out.println();
		}
	}
}