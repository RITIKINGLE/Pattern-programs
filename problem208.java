/*

  *****
   ***
    *

*/

public class program208{
	public static void main(String args[]){
		int n=5; 
		for(int i=1; i<=n; i++){
			if(i==n || i==1){
				for(int j=1; j<=(n*2)-1; j++)
				   System.out.print(" ");
			}
			else{
				for(int j=i; j>=1; j--)
				   System.out.print(" ");
				for(int j=1; j<=((n-i)*2)-1; j++)
				   System.out.print("*");
				for(int j=i; j>=1; j--)
				   System.out.print(" ");
			}
			System.out.println();
		}
	}
}