/*
ABCDE
ABCD
ABC
AB
A
AB
ABC
ABCD
ABCDE
*/

public class problem122{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=1; j<=n-i+1; j++)
					System.out.print((char)(j+64));
			}
			else{
				for(int j=1; j<=i-n+1; j++)
					System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}