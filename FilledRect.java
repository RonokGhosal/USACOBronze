package APComputerScience;

import java.util.Scanner;

public class FilledRect {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int xi = scan.nextInt();
		    int yi = scan.nextInt();
		    String ci = scan.next();
		    filledSqaure(xi,ci);
		    filledSqaure(yi,ci);

	}
	static void filledSqaure(int x, String c) {
	for(int i = 1; i <= x; i++){
        System.out.print(c);
        for(int j = 1; j <= x-1; j++) {
        System.out.print(c);
        }
        System.out.print("\n");
    }
	}

}
