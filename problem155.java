/*
EEEEE
 DDDD
  CCC
   BB
    A
   BB
  CCC
 DDDD
EEEEE
*/
public class problem154{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j>1; j--)
				   System.out.print(" ");

				for(int j=1; j<=n-i+1; j++)
				   System.out.print((char)(n-i+1+64));
			}
			else{
				for(int j=(n*2)-i; j>1; j--)
				   System.out.print(" ");

				for(int j=1; j<=i-n+1; j++)
				   System.out.print((char)(i-n+1+64));  
			}
			System.out.println();
		}
	}
}