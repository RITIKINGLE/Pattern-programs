/*
A       B       C       D       E
        F       G       H       I
                J       K       L
                        M       N
                                O
*/

public class problem76{
	public static void main(String args[]){
		int n=5, count=1;
		for(int i=1; i<=5; i++){
			for(int j=i; j>1; j--){
				System.out.print("\t");
			}
			for(int j=i; j<=n; j++){
				System.out.print((char)(count+64) +"\t");
				count++;
			}
			System.out.println();
		}
	}
}