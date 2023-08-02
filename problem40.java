/*
    5
   54
  543
 5432
54321	
*/


public class problem40{
	public static void main(String args[]){
		int n=10;
		for(int i=n; i>=1; i--){
			for(int j=i; j>1; j--){
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--){
				System.out.print(j);
			}
		 System.out.println();	
		}
	}
}