package numberPattern;

public class Numberpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1, p = 5; i <= n; i++, p--) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
				for(int j=1;j<=i;j++) {
					System.out.print(p+" ");
				}
				System.out.println();
			}
				}
				
			
	}

