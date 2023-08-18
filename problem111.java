/*
E
ED
EDC
EDCB
EDCBA
EDCB
EDC
ED
E
*/

public class problem111{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				  for(int j=n; j>=n-i+1; j--)
				   System.out.print((char)(j+64));
				} 
			else{
				for(int j=n; j>i-n;j--)
				 System.out.print((char)(j+64));
			}
		System.out.println();
		}
		
	}		
}