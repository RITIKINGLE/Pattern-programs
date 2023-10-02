/*
a       a
bb     bb
ccc   ccc
dddd dddd
eeeeeeeee
*/

public class problem232{
	public static void main(String args[]){
		int n = 5;
		for(int i=1; i<=n; i++)
		{
			if(i==n){
				for(int j=1; j<=(i*2)-1; j++)
				   System.out.print((char) + (i+96));
			}
			else{
				for(int j=i; j>=1; j--)
				   System.out.print((char) + (i+96));
				for(int j=1; j<=((n-i)*2)-1; j++)
				   System.out.print(" ");
				for(int j=i; j>=1; j--)
				   System.out.print((char) + (i+96));
			}
			System.out.println();
		}
	}
}