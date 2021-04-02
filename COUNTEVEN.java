package APComputerScience;

public class COUNTEVEN {
	public static int countEven(int[] arr) {
		int count = 0;
		for ( int num : arr) {
			if( num % 2 == 0) {
				count++;
			}
			return count;
		}
		return count;
	}

}
