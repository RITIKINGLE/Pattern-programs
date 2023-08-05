/*
o       m       j       f       a
        n       k       g       b
                l       h       c
                        i       d
                                e
*/

public class problem89{
	public static void main(String args[]){
		int n=5, count=n*(n+1)/2;
		for(int i=1; i<=n; i++){
			int c= count;
			for(int j=i; j>1; j--){
				System.out.print("\t");
			}
			for(int j=i; j<=n; j++){
				System.out.print((char)(c+96)+"\t");
				c-=j+1;
			}
			System.out.println();
			count-=i;
		}
	}
}