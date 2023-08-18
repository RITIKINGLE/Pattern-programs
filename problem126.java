/*
ABCDE
BCDE
CDE
DE
E
DE
CDE
BCDE
ABCDE
*/

public class problem126{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j<=n; j++)
					System.out.print((char)(j+64));
			}
			else{
				for(int j=(n*2)-i; j<=n; j++)
					System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}