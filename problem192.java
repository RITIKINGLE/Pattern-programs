/*
    E
   EDE
  EDCDE
 EDCBCDE
EDCBABCDE
 EDCBCDE
  EDCDE
   EDE
    E     
*/

public class problem192{
	public static void main(String args[]){
		int n=27;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j<n; j++)
			   	   System.out.print(" ");
				
				for(int j=n; j>=n-i+1; j--)
				   System.out.print((char)(j+64));

				for(int j=n-i+2; j<=n; j++)
				   System.out.print((char)(j+64));
			}else{
				for(int j=i; j>n; j--)
				   System.out.print(" ");

				for(int j=n; j>=i-n+1; j--)
				   System.out.print((char)(j+64));

				for(int j=i-n+2;  j<=n; j++)
				   System.out.print((char)(j+64));
			}
			
			System.out.println();
				
		}
	}
}