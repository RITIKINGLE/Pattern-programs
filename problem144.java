/*
    E
   Ed
  EdC
 EdCb
EdCbA
 EdCb
  EdC
   Ed
    E
*/
public class problem144{
	public static void main(String arg[]){
		int n=5;
		for(int i=1;i<=(n*2)-1; i++)
		{	
			if(i<=n){
				for(int j=i; j<n; j++)
				   System.out.print(" ");
				
			 	for(int j=n; j>=n-i+1; j--)	
				   System.out.print((char)(j+((j%2!=0)?64:96)));
			}
			else{
				for(int j=i; j>n; j--)
				   System.out.print(" ");

				for(int j=n; j>=i-n+1; j--)
				   System.out.print((char)(j+((j%2!=0)?64:96)));
			}
			System.out.println();
		}	
	}
}