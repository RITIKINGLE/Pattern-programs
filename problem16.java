//A
//BB
//CCC
//DDDD
//EEEEE

public class problem16{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print((char)(i+64));
			}
			System.out.println();
		}

	}
}