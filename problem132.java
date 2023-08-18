/*
EDCBA
 DCBA
  CBA
   BA
    A
   BA
  CBA
 DCBA
EDCBA  
*/

public class problem132{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{	
			if(i<=5){
				for(int j=i; j>1;j--)
				   System.out.print(" ");	
				
				for(int j=n-i+1; j>=1; j--)
				   System.out.print((char)(j+64));
			}
			else{
				for(int j=n; j>i-n+1; j--)
			  	   System.out.print(" ");
				for(int j=i-n+1; j>=1; j--)
				   System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}