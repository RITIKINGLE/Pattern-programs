/*
EdCbAbCdE
 EdCbCdE
  EdCdE
   EdE
    E
   EdE
  EdCdE
 EdCbCdE
EdCbAbCdE
*/

public class problem205{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j>1; j--)
				   System.out.print(" ");

				for(int j=n; j>=i; j--)
				   System.out.print((char)(j+((j%2!=0)?64:96)));
				for(int j=i+1; j<=n; j++)
				   System.out.print((char)(j+((j%2!=0)?64:96)));				
			}
			else{
				for(int j=1; j<(n*2)-i; j++)
				   System.out.print(" ");

				for(int j=n; j>=(n*2)-i; j--)
				   System.out.print((char)(j+((j%2!=0)?64:96)));
				for(int j=(n*2)-i+1; j<=n; j++)
				   System.out.print((char)(j+((j%2!=0)?64:96)));				
			}
			System.out.println();
		}
	}
}