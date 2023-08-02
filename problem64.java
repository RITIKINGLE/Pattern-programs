/*
15
10	14
6	9	13
3	5	8	12
1	2	4	7	11
*/

public class problem64{
	public static void main(String args[]){
		int count=15;
		for(int i=5; i>=1; i--){
			int c= count;
			for(int j=i; j<=5; j++){
				System.out.print(c +"\t");
				c+=j;
			}
		 System.out.println();
		 count-=i;
		}
	} 
}