package APComputerScience;
import java.util.*;
import java.util.Arrays;
public class badCS{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int q = scan.nextInt();
    int[] hb = new int[n];
    for(int i = 0; i < n; i++){
        int x = scan.nextInt();
        hb[i] = x;
    }
    for(int i = 0; i < q; i++){
     int start = scan.nextInt();
    int end = scan.nextInt();
    for(int j = start-1 ; j < end-1 ; j++){
        int sum = 0;
        sum = sum + hb[j];
        System.out.println(sum);
    }   
    }
    
}
    
}
