/*
    A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE
 DDDDDDD
  CCCCC
   BBB
    A   
*/

public class problem191{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j<n; j++)
			   	   System.out.print(" ");
				
				for(int j=1; j<=(i*2)-1; j++)
				   System.out.print((char)(i+64));
			}
			else{
				for(int j=i; j>n; j--)
				   System.out.print(" ");

				for(int j=1; j<=(((n*2)-i)*2)-1; j++)
				   System.out.print((char)((n*2)-i+64));
			}
			System.out.println();
				
		}
	}
}