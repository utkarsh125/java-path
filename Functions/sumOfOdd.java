package Functions;
import java.util.*;
public class sumOfOdd {
    public static void printSum(int n) {
        int sum = 0;
        for(int i = 1; i<=n;i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();

        printSum(n);
    }
}