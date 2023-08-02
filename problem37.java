/* 
    5
   44
  333
 2222 
11111
*/

public class problem37{
	public static void main(String args[]){
		for(int i=5; i>=1; i--){
			for(int j=i; j>1; j--){
				System.out.print(" ");
			}
			for(int j=i; j<=5; j++){
				System.out.print(i);
			}
		 System.out.println();
		}
	}
}