/*
1       1
21     12
321   123
4321 1234
543212345
*/

public class problem239{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n; i++)
		{
			if(i==n){
				for(int j=i; j>=1; j--)
				   System.out.print((char) + (j+64));

				for(int j=2; j<=n; j++)
				   System.out.print((char) + (j+64));
			}
			else{
				for(int j=i; j>=1;j--)
				   System.out.print((char) + (j+64));
		
				for(int j=1; j<=((n-i)*2)-1; j++)
				   System.out.print(" ");
		
				for(int j=1; j<=i; j++)
				   System.out.print((char) + (j+64));
			}
			System.out.println();
		}
	}
}