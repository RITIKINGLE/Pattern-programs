/*
E       D       C       B       A
        I       H       G       F
                L       K       J
                        N       M
				O
*/

public class problem78{
	public static void main(String args[]){
		int n=5, count=n;
		for(int i=n; i>=1; i--){
			int c= count;
			for(int j=i; j<n; j++){
				System.out.print("\t");
			}
			for(int j=i; j>=1; j--){
				System.out.print((char)(c+96) +"\t");
				c-- ;
			}
			System.out.println();
			count+=i-1;
		}
	}
}