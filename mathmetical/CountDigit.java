import java.util.*;
public class CountDigit {
    public static void countDigit(int num){
        int ans=0;
        while(num >0){
            num = num / 10;
            ans++;
        }
        System.out.println("Count="+ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of NUM:");
        int num =sc.nextInt();  
        sc.close();
        countDigit(num);      
    }
}
