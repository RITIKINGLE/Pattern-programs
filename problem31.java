//ABCDE
//ABCD
//ABC
//AB
//A

public class problem31{
	public static void main(String args[]){
		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}
