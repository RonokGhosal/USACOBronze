package APComputerScience;
import java.util.Scanner;
public class MazePath{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int m = scan.nextInt();
      String[] maze = new String[n];
      for(int i = 0; i < n; i++){
          String s = scan.next();
          maze[i] = s; 
      }
      String move = scan.next();
      int curR = 1,curC = 1;
      
      int[] cursor = new int[2];
      cursor[0] = cursor[1] = 1;
      
      for(int j = 0; j < move.length(); j++){
          char dir = move.charAt(j);
          switch (dir)  {
	          case 'd': cursor[0] = cursor[0] + 1;
	          			printCustom(cursor);
	          			break;
	          case 'r': cursor[1] = cursor[1] + 1;
	          			printCustom(cursor);
	          			break;
	          case 'u':	cursor[0] = cursor[0] - 1;
	          			printCustom(cursor);
	          			break;
	          case 'l': cursor[1] = cursor[1] - 1;
	          			printCustom(cursor);	
	          			break;
          }
        	  
         /* if(dir == 'd'){
              //curR++;
              cursor[0] = cursor[0] + 1;
              printCustom(cursor);
          }else if(dir == 'r'){
              //curC++;
              cursor[1] = cursor[1] + 1;
              printCustom(cursor);
              //System.out.println(curC);
          }else if(dir == 'u'){
              //curR--;
              cursor[0] = cursor[0] - 1;
              printCustom(cursor);
              //System.out.println(curR);
          }else if(dir == 'l'){
              //curC--;
              cursor[1] = cursor[1] - 1;
              printCustom(cursor);
              //System.out.println(curC);
          }*/
      }
       //if(curR == 1 && curC == m-1){
      if(cursor[0] == 1  && cursor[1] == m-1) {
           System.out.println("Right path!");
      }else{
           System.out.println("Wrong path!");
      }
    }
    static void printCustom(int[] xy){
    	System.out.println("["+xy[0]+ "," + xy[1] + "]");
    }
  }