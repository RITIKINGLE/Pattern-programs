/*
1
2	6
3	7	10	
4	8	11	13
5	9	12	14	15
*/

public class problem69{
	public static void main(String args[]){
		int count=1;
		for(int i=5; i>=1; i--){
			int c=count;
			for(int j=5; j>=i; j--){
				System.out.print(c +"\t");
				c+=j-1;
			}
		 System.out.println();
		 count+=1;
		}
	} 
}