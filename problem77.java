/*
O       N       M       L       K
        J       I       H       G
                F       E       D
                        C       B
                                A
*/

public class problem77{
	public static void main(String args[]){
		int n=5, count=n*(n+1)/2;
		for(int i=1; i<=5; i++){
			for(int j=i; j>1; j--){
				System.out.print("\t");
			}
			for(int j=i; j<=n; j++){
				System.out.print((char)(count+64) +"\t");
				count--;
			}
			System.out.println();
		}
	}
}