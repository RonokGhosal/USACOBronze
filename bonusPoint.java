package APComputerScience;

import java.util.Scanner;
import java.util.ArrayList;

public class bonusPoint{
	
  public static void main(String[] args){
	ArrayList<Integer> arr = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    int shopNum = scan.nextInt();
    for(int i = 0; i < shopNum;i++){
        int x = scan.nextInt();
        arr.add(x);
    }
    int y = scan.nextInt();
    String gType = scan.next();
    int sum = 0;
    for(int j = 0; j < arr.size();j++){
        if(arr.get(j) > y){
            sum = sum + arr.get(j); 
        }
    }
    if(gType.equals("bakery")){
        System.out.println(sum*5);
    }
    if(gType.equals("produce")){
        System.out.println(sum*2);
    }
    if(gType.equals("drinks")){
        System.out.println(sum);
    }
    
  }
}
