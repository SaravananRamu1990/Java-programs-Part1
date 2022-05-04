package DiamondProgram;

import org.testng.annotations.Test;


public class DecreasingPattern {
@Test
	public void dp() {
		int n=8;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		
	}

}
