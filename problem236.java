/*
A       A
Ab     bA
AbC   CbA
AbCd dCbA
AbCdEdCbA
*/

public class problem236{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++)
		{
			if(i==n){
				for(int j=1; j<=i; j++)
				   System.out.print((char) + (j+((j%2!=0)?64:96)));
				for(int j=n-1; j>=1; j--)
				   System.out.print((char) + (j+((j%2!=0)?64:96)));
			}
			else{
				for(int j=1; j<=i; j++)
				   System.out.print((char) + (j+((j%2!=0)?64:96)));
		
				for(int j=1; j<=((n-i)*2)-1; j++)
				   System.out.print(" ");

				for(int j=i; j>=1; j--)
				   System.out.print((char) + (j+((j%2!=0)?64:96)));
			}
			System.out.println();
		}
	}
}