/*
ABCDEDCBA
 BCDEDCB
  CDEDC
   DED
    E
   DED
  CDEDC
 BCDEDCB
ABCDEDCBA
*/

public class program202{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j>1; j--)
				   System.out.print(" ");

				for(int j=i; j<=n; j++)
				   System.out.print((char)(j+64));

				for(int j=n-1; j>=i; j--)
				   System.out.print((char)(j+64));
			}
			else{
				for(int j=i; j<(n*2)-1; j++)
				   System.out.print(" ");

				for(int j=(n*2)-i; j<=n; j++)
				   System.out.print((char)(j+64));

				for(int j=n-1; j>=(n*2)-i; j--)
				   System.out.print((char)(j+64));
			}

			System.out.println();
		}
	}
}