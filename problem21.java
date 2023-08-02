//e
//de
//cde
//bcde
//abcde

public class problem21{
	public static void main(String args[]){
		for(int i=5; i>=1; i--){
			for(int j=i; j<=5; j++){
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}