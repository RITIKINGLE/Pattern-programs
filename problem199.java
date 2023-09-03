/*
AbCdEdCbA
 AbCdCbA
  AbCbA
   AbA
    A
   AbA
  AbCbA
 AbCdCbA
AbCdEdCbA
*/

public class program199{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j>1; j--)
				   System.out.print(" ");

				for(int j=1; j<=n-i+1; j++)
				   System.out.print((char)(j+((j%2!=0)?64:96)));

				for(int j=n-i; j>=1; j--)
				   System.out.print((char)(j+((j%2!=0)?64:96)));
			}
			else{
				for(int j=i; j<(n*2)-1; j++)
				   System.out.print(" ");

				for(int j=1; j<=i-n+1; j++)
				   System.out.print((char)(j+((j%2!=0)?64:96)));

				for(int j=i-n; j>=1; j--)
				   System.out.print((char)(j+((j%2!=0)?64:96)));
			}

			System.out.println();
		}
	}
}