/*
    E
   DD
  CCC
 BBBB
AAAAA
*/

public class problem43{
	public static void main(String args[]){
		int n=5;
		for(int i=n; i>=1; i--){
			for(int j=i; j>1; j--){
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++){
				System.out.print((char)(i+64));
			}
		 System.out.println();			
		}
	}
}