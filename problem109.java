/*
A
AB
ABC
ABCD
ABCDE
ABCD
ABC
AB
A
*/

public class problem109{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				  for(int j=1; j<=i; j++)
				   System.out.print((char)(j+64));
				} 
			else{
				for(int j=1;j<=(n*2)-i;j++)
				 System.out.print((char)(j+64));
			}
		System.out.println();
		}
		
	}		
}