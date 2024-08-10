public class Pallindrome {
    public static Boolean isPallindrome(int num){
        int rev=0; int temp =num;
        while(temp != 0){
            int rem =temp % 10;
            rev = (rev*10) + rem;
            temp = temp / 10;
        }
        return(rev == num);
    }
    public static void main(String[] args) {
        Boolean ans  =isPallindrome(151);
        System.out.println(ans);
    }
}
