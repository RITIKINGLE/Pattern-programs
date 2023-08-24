/*
    E
   EdE
  EdCdE
 EdCbCdE
EdCbAbCdE                 
*/

public class problem178{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++){
			for(int j=i; j<n; j++)
			   System.out.print(" ");

			for(int j=n; j>=n-i+1; j--)	
			   System.out.print((char)(j+((j%2!=0)?64:96)));

			for(int j=n-i+2; j<=n; j++)
			   System.out.print((char)(j+((j%2!=0)?64:96)));

			System.out.println();
		}
	}
}