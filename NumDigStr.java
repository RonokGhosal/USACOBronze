package APComputerScience;
import java.util.Scanner;
public class NumDigStr{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str1 = scan.next();
        System.out.println(numDig(str,str1));
    }static int numDig(String s,String s1){
        int count = 0;
        int count1 = 0;
            for(int i = 0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                	count = count + 1;
                }
            }
            for(int i = 0; i < s1.length(); i++){
                if(Character.isDigit(s1.charAt(i))){
                	count = count + 1;
                }
            }
            return count + count1;
    }
}