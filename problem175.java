/*
    e
   ddd
  ccccc
 bbbbbbb
aaaaaaaaa            
*/

public class problem175{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++){
			for(int j=i; j<n; j++)
			   System.out.print(" ");

			for(int j=1; j<=(i*2)-1; j++)	
			   System.out.print((char)((n-i+1)+96));

			System.out.println();
		}
	}
}