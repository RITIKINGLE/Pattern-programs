/*
e       e
dd     dd
ccc   ccc
bbbb bbbb
aaaaaaaaa

*/

public class problem230{
	public static void main(String args[]){
		int n=5;
		for(int i=n; i>=1; i--)
		{
			if(i==1){
				for(int j=1; j<=(n*2)-1; j++)
				   System.out.print((char)+(i+96));
			}
			else{
				for(int j=i; j<=n; j++)
				   System.out.print((char)+(i+96));
	
				for(int j=1; j<=((i-1)*2)-1; j++)
				   System.out.print(" ");

				for(int j=i; j<=n; j++)
				   System.out.print((char)+(i+96));
			}
			System.out.println();
		}
	}
}