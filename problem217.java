/*
123454321
2345 5432
345   543
45     54
5       5
*/

public class program216{
	public static void main(String args[]){
		int n=5; 
		for(int i=1; i<=n; i++)
		{
			if(i==1){
				for(int j=i; j<=n; j++)
				   System.out.print((char)(j+((j%2!=0)?64:96)));

				for(int j=n-1; j>=1; j--)
				   System.out.print((char)(j+((j%2!=0)?64:96)));
			}
			else{
				for(int j=i; j<=n; j++)
				   System.out.print((char)(j+((j%2!=0)?64:96)));

				for(int j=1; j<=((i-1)*2)-1; j++)
				   System.out.print(" ");

				for(int j=n; j>=i; j--)
				   System.out.print((char)(j+((j%2!=0)?64:96)));
			}
			System.out.println();
		}
	}	
}