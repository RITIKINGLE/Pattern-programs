/*
k       g       d       b       a
        l       h       e       c
                m       i       f
                        n       j
                                o
*/

public class problem83{
	public static void main(String args[]){
		int n=5, count=(n*(n-1)/2)+1;
		for(int i=1; i<=n; i++){
			int c= count;
			for(int j=i; j>1; j--){
				System.out.print("\t");
			}
			for(int j=n; j>=i; j--){
				System.out.print((char)(c+96)+"\t");
				c-=j-1;
			}
			System.out.println();
			count++;
		}
	}
}