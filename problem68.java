/*
15
13	14
10	11	12	
6	7	8	9	
1	2	3	4	5
*/

public class problem68{
	public static void main(String args[]){
		int count=15;
		for(int i=1; i<=5; i++){
			int c=count;
			for(int j=1; j<=i; j++){
				System.out.print(c +"\t");
				c+=1;
			}
		 System.out.println();
		 count-=i+1;
		}
	} 
}