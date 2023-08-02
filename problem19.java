//a
//ba
//cba
//dcba
//edcba


public class problem19{
	public static void main(String args[]){
		int n=5;
		for(int i=1; i<=n; i++){
			for(int j=i; j<=i; j++){
				System.out.print((char)(i+96));
			}
			System.out.println();
		}

	}
}