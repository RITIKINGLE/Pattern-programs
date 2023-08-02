/*
1
3	2
6	5	4
10	9	8	7	
15	14	13	12	11
*/

public class problem65{
	public static void main(String args[]){
		int count=1;
		for(int i=1; i<=5; i++){
			int c=count;
			for(int j=1; j<=i; j++){
				System.out.print(c +"\t");
				c-=1;
			}
		 System.out.println();
		 count+=i+1;
		}
	} 
}