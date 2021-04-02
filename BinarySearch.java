package APComputerScience;

public class BinarySearch {
	public int binarySearch(int[] sortedArr, int goal) {
		int left = 0;
		int right = sortedArr.length-1;
		while(left<=right) {
			int middle = (left + right)/2;
					if(goal == sortedArr[middle]) {
						return middle;
					}
					else if(goal<sortedArr[middle]) {
						right = middle - 1;
					}
					else {
						left = middle + 1;
					}
		}
		return -1 ;
	}

}
