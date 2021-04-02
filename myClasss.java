package APComputerScience;
import java.util.Scanner;
public class myClasss{
    public static void main(String args[]){
        String s1;
        String s2;
        String s3;
        Scanner scan = new Scanner(System.in);
        s1 = scan.next();
        s2 = scan.next();
        s3 = scan.next();
        if(s1.compareTo(s2) == 1 && s2.compareTo(s3) == 1) {
        	System.out.println(s3);
        	System.out.println(s2);
        	System.out.println(s1);
        }
        if(s1.compareTo(s2) == 0 && s2.compareTo(s3) == 0) {
        	System.out.println(s1);
        	System.out.println(s2);
        	System.out.println(s3);
        }
        if(s1.compareTo(s2) == 0 && s2.compareTo(s3) == 1) {
        	System.out.println(s1);
        	System.out.println(s3);
        	System.out.println(s2);
        }
        if(s1.compareTo(s2) == 1 && s2.compareTo(s3) == 1) {
        	System.out.println(s1);
        	System.out.println(s2);
        	System.out.println(s3);
        }
        if(s1.compareTo(s2) == 1 && s2.compareTo(s3) == 0 && s1.compareTo(s3) == 0) {
        	System.out.println(s2);
        	System.out.println(s1);
        	System.out.println(s3);
        }
        if(s1.compareTo(s2) == 1 && s2.compareTo(s3) == 0 && s1.compareTo(s3) == 1) {
        	System.out.println(s2);
        	System.out.println(s3);
        	System.out.println(s1);
        }
        if(s1.compareTo(s2) == 1 && s2.compareTo(s3) == 1) {
        	System.out.println(s3);
        	System.out.println(s1);
            System.out.println(s2);
        }  
}
    }
