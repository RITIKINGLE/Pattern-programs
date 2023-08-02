/*
1
2	3
4	5	6
7	8	9	10
11	12	13	14	15
*/

public class problem65{
	public static void main(String args[]){
		int count=1;
		for(int i=5; i>=1; i--){
			for(int j=i; j<=5; j++){
				System.out.print(count +"\t");
				count+=1;
			}
		 System.out.println();
		}
	} 
}