/*
EEEEE
DDDD
CCC
BB
A
*/

public class problem5{
	public static void main(String args[]){
		for(int i=5; i>=1; i--){
			for(int j=i; j>=1; j--){
				System.out.print((char)(i+64));
			} 

			System.out.println();	
		}
	}
}