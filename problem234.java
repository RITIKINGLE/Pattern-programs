/*
a       a
ab     ba
abc   cba
abcd dcba
abcdedcba
*/

public class problem234{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++)
		{
			if(i==n){
				for(int j=1; j<=i; j++)
				   System.out.print((char) + (j+64));
				for(int j=n-1; j>=1; j--)
				   System.out.print((char) + (j+64));
			}
			else{
				for(int j=1; j<=i; j++)
				   System.out.print((char) + (j+64));
		
				for(int j=1; j<=((n-i)*2)-1; j++)
				   System.out.print(" ");

				for(int j=i; j>=1; j--)
				   System.out.print((char) + (j+64));
			}
			System.out.println();
		}
	}
}