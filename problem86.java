/*
E       I       L       N       O
        D       H       K       M
                C       G       J
                        B       F
                                A
*/

public class problem86{
	public static void main(String args[]){
		int n=5, count=n;
		for(int i=1; i<=n; i++){
			int c= count;
			for(int j=i; j>1; j--){
				System.out.print("\t");
			}
			for(int j=n; j>=i; j--){
				System.out.print((char)(c+64)+"\t");
				c+=j-1;
			}
			System.out.println();
			count--;
		}
	}
}