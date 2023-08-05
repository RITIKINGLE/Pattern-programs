/*
a       c       f       j       o
        b       e       i       n
                d       h       m
                        g       l
                                k
*/

public class problem85{
	public static void main(String args[]){
		int n=5, count=1;
		for(int i=1; i<=n; i++){
			int c= count;
			for(int j=i; j>1; j--){
				System.out.print("\t");
			}
			for(int j=i; j<=n; j++){
				System.out.print((char)(c+96)+"\t");
				c+=j+1;
			}
			System.out.println();
			count+=i;
		}
	}
}