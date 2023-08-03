/*
AO
FJ      BN
JF      GI      CM
MC      KE      HH      DL
OA      NB      LD      IG      EK
*/

public class problem72{
	public static void main(String args[]){
		int n=5, count1=1, count2=15;
		for(int i=n; i>=1; i--){
			int c1=count1, c2=count2;
			for(int j=i; j<=n; j++){
				System.out.print((char)(c1+64)+""+(char)(c2+64)+"\t");
				c1-=j;
				c2+=j;
			}
			System.out.println();
			count1+=i;
			count2-=i;
		}
	}
}