/*
				Ao
                        Bj      Fn
                Cf      Gi      Jm
        Dc      He      Kh      Ml
Ea      Ib      Ld      Ng      Ok
*/

public class problem75{
	public static void main(String args[]){
		int n=5, count1=1, count2=(n*(n+1)/2);
		System.out.print(count2);
		for(int i=n; i>=1; i--){
			int c1=count1, c2=count2;

			for(int j=i; j>1; j--){
				System.out.print("\t");
			}
			
			for(int j1=n,j2=i; j1>=i||j2<=n ; j1--, j2++){
				System.out.print((char)(c1+64)+""+(char)(c2+96)+"\t");
				c1+=j1-1;
				c2+=j2;
			}
			System.out.println();
			count1++;
			count2-=i;
		}
	}
}