package APComputerScience;
import java.util.Scanner;
public class NumLettersClass{
   public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
    String s = scan.next();
    System.out.println(numLetters(s));
    }
    
    static int numLetters(String str){
        int count = 0;
        String stru = str.toUpperCase();
        for(int i = 0; i < str.length(); i++){
            if(stru.charAt(i) == 'A' ||stru.charAt(i) == 'B' ||stru.charAt(i) == 'C' ||stru.charAt(i) == 'D' ||stru.charAt(i) == 'E' ||stru.charAt(i) == 'F' ||stru.charAt(i) == 'G' ||stru.charAt(i) == 'H' ||stru.charAt(i) == 'I' ||stru.charAt(i) == 'J' ||stru.charAt(i) == 'K' ||stru.charAt(i) == 'L' ||stru.charAt(i) == 'M' ||stru.charAt(i) == 'N' ||stru.charAt(i) == 'O' ||stru.charAt(i) == 'P' ||stru.charAt(i) == 'Q' ||stru.charAt(i) == 'R' ||stru.charAt(i) == 'S' ||stru.charAt(i) == 'T' ||stru.charAt(i) == 'U' ||stru.charAt(i) == 'V' ||stru.charAt(i) == 'W' ||stru.charAt(i) == 'X' ||stru.charAt(i) == 'Y' ||stru.charAt(i) == 'Z'){
                count++;
            }
        }return count;
    }
}