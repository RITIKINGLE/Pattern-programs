/*
    A
   BA
  CBA
 DCBA
EDCBA
 DCBA
  CBA
   BA
    A
*/

public class problem133{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{	
			if(i<=5){
				for(int j=i; j<n;j++)
				   System.out.print(" ");	
				
				for(int j=i; j>=1; j--)
				   System.out.print((char)(j+64));
			}
			else{
				for(int j=i; j>n; j--)
			  	   System.out.print(" ");
				for(int j=(n*2)-i; j>=1; j--)
				   System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}