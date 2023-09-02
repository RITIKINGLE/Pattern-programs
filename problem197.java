/*
111111111
 2222222
  33333
   444
    5
   444
  33333
 2222222
111111111
*/

public class program197{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j>1; j--)
				   System.out.print(" ");

				for(int j=1; j<=((n-i+1)*2)-1; j++)
				   System.out.print(i);
			}
			else{
				for(int j=i; j<(n*2)-1; j++)
				   System.out.print(" ");

				for(int j=1; j<=((i-n+1)*2)-1; j++)
				   System.out.print((n*2)-i);
			}

			System.out.println();
		}
	}
}