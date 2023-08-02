/*
    1
   22
  333
 4444
55555
*/

public class problem36{
	public static void main(String args[]){
		int n=10;
		for(int i=1; i<=n; i++){
			for(int j=i; j<n; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}