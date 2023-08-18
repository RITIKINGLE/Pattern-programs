/*
EeEeE
 dDdD
  CcC
   bB
    A
   bB
  CcC
 dDdD
EeEeE 
*/

public class problem134{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{	
			if(i<=5){
				for(int j=i; j>1; j--)
				   System.out.print(" ");	
				
				for(int j=i; j<=n; j++)
				   System.out.print((char)((n-i+1)+((j%2!=0)?64:96)));
			}
			else{
				for(int j=(n*2)-i; j>1; j--)
			  	   System.out.print(" ");
				for(int j=i-n+1; j>=1; j--)
				   System.out.print((char)((i-n+1)+((j%2!=0)?64:96)));
			}
			System.out.println();
		}
	}
}