/*
o       j       f       c       a
        n       i       e       b
                m       h       d
                        l       g
                                k
*/

public class problem84{
	public static void main(String args[]){
		int n=5, count=n*(n+1)/2;
		for(int i=1; i<=n; i++){
			int c= count;
			for(int j=i; j>1; j--){
				System.out.print("\t");
			}
			for(int j=n; j>=i; j--){
				System.out.print((char)(c+96)+"\t");
				c-=j;
			}
			System.out.println();
			count--;
		}
	}
}