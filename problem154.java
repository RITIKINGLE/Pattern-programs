/*
AAAAA
 BBBB
  CCC
   DD
    E
   DD
  CCC
 BBBB
AAAAA
*/
public class problem154{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n){
				for(int j=i; j>1; j--)
				   System.out.print(" ");

				for(int j=i; j<=n; j++)
				   System.out.print((char)(i+64));
			}
			else{
				for(int j=(n*2)-i; j>1; j--)
				   System.out.print(" ");

				for(int j=(n*2)-i; j<=n; j++)
				   System.out.print((char)((n*2)-i+64));  
			}
			System.out.println();
		}
	}
}