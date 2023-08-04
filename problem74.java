/*
oA      jF      fJ      cM      aO
        nB      iG      eK      bN
                mC      hH      dL
                        lD      gI
                                kE
*/

public class problem74{
	public static void main(String args[]){
		int n=5, count1=15, count2=1;
		for(int i=1; i<=n; i++){
			int c1=count1, c2=count2;

			for(int j=i; j>1; j--){
				System.out.print("\t");
			}
			
			for(int j1=n; j1>=i; j1--){
				System.out.print((char)(c1+96)+""+(char)(c2+64)+"\t");
				c1-=j1;
				c2+=j1;
			}
			System.out.println();
			count1--;
			count2++;
		}
	}
}