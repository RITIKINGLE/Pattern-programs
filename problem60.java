/*
11
12  7	
13  8  4
14  9  5  2
15  10 6  3  1
*/

public class problem60{
	public static void main(String args[]){
		int count=11;
		for(int i=5; i>=1; i--){
			int c= count;
			for(int j=5; j>=i; j--){
				System.out.print(c +"\t");
				c=c-j;
			}
		 System.out.println();
		 count+=1;
		}
	}
}