/*
15
14	10	
13	9	6	
12	8	5	3
11	7	4	2	1
*/

public class problem70{
	public static void main(String args[]){
		int count=15;
		for(int i=5; i>=1; i--){
			int c=count;
			for(int j=5; j>=i; j--){
				System.out.print(c +"\t");
				c-=j-1;
			}
		 System.out.println();
		 count-=1;
		}
	} 
}