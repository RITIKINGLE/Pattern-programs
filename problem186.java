/*
AbCdEdCbA
 AbCdCbA
  AbCbA
   AbA
    A
*/

public class program186{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j>1; j--)
			   System.out.print(" ");

			for(int j=1; j<=n-i+1; j++)
			   System.out.print((char)(j+((j%2!=0)?64:96)));

			for(int j=n-i; j>=1; j--)
			   System.out.print((char)(j+((j%2!=0)?64:96)));
	
			System.out.println();
		}
	}
}