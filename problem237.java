/*
A       A
bb     bb
CCC   CCC
dddd dddd
EEEEEEEEE
*/

public class problem237{
	public static void main(String args[]){
		int n = 5;
		for(int i=1; i<=n; i++)
		{
			if(i==n){
				for(int j=1; j<=(i*2)-1; j++)
				   System.out.print((char) + (i+((i%2!=0)?64:96)));
			}
			else{
				for(int j=i; j>=1; j--)
				   System.out.print((char) + (i+((i%2!=0)?64:96)));
				for(int j=1; j<=((n-i)*2)-1; j++)
				   System.out.print(" ");
				for(int j=i; j>=1; j--)
				   System.out.print((char) + (i+((i%2!=0)?64:96)));
			}
			System.out.println();
		}
	}
}