/*
EdCbA
EdCb
EdC
Ed
E
Ed
EdC
EdCb
EdCbA
*/

public class problem129{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=n; j>=i; j--)
					System.out.print((char)(j+((j%2!=0)?64:96)));
			}
			else{
				for(int j=n; j>=(n*2)-i; j--)
					System.out.print((char)(j+((j%2!=0)?64:96)));
			}
			System.out.println();
		}
	}
}