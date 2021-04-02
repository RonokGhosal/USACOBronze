package APComputerScience;

public class drawLine {

	public void drawLine(int n) {
		if(n==0) {
			System.out.println("Thats all folks!");
		}
			else
			{
				for( int i =1; i<=n; i++)
					System.out.println("*");
					System.out.println();
					drawLine(n-1);
			}
	
	

	}
	}


