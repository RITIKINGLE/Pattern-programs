/*
5
4	9
3	8	12	
2	7	11	14
1	6	10	13	15
*/

public class problem70{
	public static void main(String args[]){
		int count=5;
		for(int i=5; i>=1; i--){
			int c=count;
			for(int j=5; j>=i; j--){
				System.out.print(c +"\t");
				c+=j;
			}
		 System.out.println();
		 count-=1;
		}
	} 
}