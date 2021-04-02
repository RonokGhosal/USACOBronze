package APComputerScience;
import java.util.Scanner;
public class Concatinator{
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int x = scan.nextInt();
  int y= scan.nextInt();
  String str = scan.next();
  changer(x,y,str);
}
static void changer(int k, int n,String s){
    for(int i = 0; i <= n; i++){
       String sub = s.substring(k,s.length());
       if(i==0) {
    	   s = s;
       }else {
       s = sub + s;
       }
       //System.out.println("str is " + s);
       
   }
    System.out.print(s);
   
   
}
}
