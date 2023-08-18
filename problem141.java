/*  
    E
   DD
  CCC
 BBBB
AAAAA
 BBBB
  CCC
   DD
    E  
    
*/

public class problem141{
	public static void main(String args[]){
		int n=5;
		for(int i=1 ; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j<n; j++)
				   System.out.print(" ");
				
				for(int j=n-i+1; j<=n; j++)
				   System.out.print((char)((n-i+1)+64));
			}
			else{
				for(int j=i-n; j>=1; j--)
				   System.out.print(" ");

				for(int j=i-n+1; j<=n; j++)
				   System.out.print((char)((i-n+1)+64));
			}
			System.out.println();
		}
	}
}