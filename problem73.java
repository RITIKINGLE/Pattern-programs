/*
Ae      Ci      Fl      Jn      Oo
Bd      Eh      Ik      Nm
Dc      Hg      Mj
Gb      Lf
Ka
*/

public class problem73{
	public static void main(String args[]){
		int n=5, count1=1, count2=5;
		for(int i=1; i<=n; i++){
			int c1=count1, c2=count2;
			for(int j1=i, j2=n ; j1<=n||j2>i ;  j1++,j2--){
				System.out.print((char)(c1+64)+""+(char)(c2+96)+"\t");
				c1+=j1+1;
				c2+=j2-1;
			}
			System.out.println();
			count1+=i;
			count2--;
		}
	}
}