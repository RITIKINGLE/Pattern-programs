/*
a       f       j       m       o
        b       g       k       n
                c       h       l
                        d       i
                                e
*/

public class problem82{
	public static void main(String args[]){
		int n=5, count=1;
		for(int i=1; i<=5; i++){
			int c= count;
			for(int j=i; j>1; j--){
				System.out.print("\t");
			}
			for(int j=n; j>=i; j--){
				System.out.print((char)(c+96) +"\t");
				c+=j;
			}
			System.out.println();
			count++; 
		}
	}
}