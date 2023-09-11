/*
EEEEEEEEE
DDDD DDDD
CCC   CCC
BB     BB
A       A
*/

public class program213{
	public static void main(String args[]){
		int n=5;
		for(int i=n; i>=1; i--)
		{
			if(i==n){
				for(int j=i; j>=1; j--)
				   System.out.print((char)(i+64));
		
				for(int j=i; j>1; j--)
				   System.out.print((char)(i+64));
			}
			else{
				for(int j=i; j>=1; j--)
				   System.out.print((char)(i+64));
			
				for(int j=1; j<=((n-i)*2)-1; j++)
				   System.out.print(" ");
	
				for(int j=i; j>=1; j--)
				   System.out.print((char)(i+64));
			}
			System.out.println();
		}
	}
}