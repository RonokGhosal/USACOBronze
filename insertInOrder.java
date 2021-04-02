package APComputerScience;

public class insertInOrder {
	int[]a;
	int n = a.length-1;
	public void insertInOrder(int[]a, int n, int newValue) {
		int k = n;
		while(k > 0 && a[k-1] > newValue) {
			a[k] = a[k-1];
			k--;
		}
		a[k] = newValue;
		System.out.println(a[k]);
	}
	

}
