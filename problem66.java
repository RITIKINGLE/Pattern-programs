/*
15
14	13	
12	11	10	
9	8	7	6	
5	4	3	2	1
*/

public class problem65{
	public static void main(String args[]){
		int count=15;
		for(int i=5; i>=1; i--){
			for(int j=i; j<=5; j++){
				System.out.print(count +"\t");
				count-=1;
			}
		 System.out.println();
		}
	} 
}