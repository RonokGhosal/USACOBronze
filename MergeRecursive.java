package APComputerScience;

public class MergeRecursive {
public void sort(int []arr, int n1, int n2) {
	if(n1==n2) {
		return;
	}
	int midpoint = (n1+n2)/2;
	sort(arr,n1,midpoint);
	sort(arr,midpoint + 1,n2);
}
}
