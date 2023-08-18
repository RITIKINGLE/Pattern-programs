/*  
    A
   BB
  CCC
 DDDD
EEEEE
 DDDD
  CCC
   BB
    A
    
*/

public class problem140{
	public static void main(String args[]){
		int n=5;
		for(int i=1 ; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j<n; j++)
				   System.out.print(" ");
				
				for(int j=n-i+1; j<=n; j++)
				   System.out.print((char)(i+64));
			}
			else{
				for(int j=i-n; j>=1; j--)
				   System.out.print(" ");

				for(int j=i-n+1; j<=n; j++)
				   System.out.print((char)(((n*2)-i)+64));
			}
			System.out.println();
		}
	}
}