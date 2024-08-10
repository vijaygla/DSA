// // ITERATIVE METHOD
// public class Factorial {
//     public static int fact(int n){
//         int ans =1;
//         for(int i=2;i<=n;i++){
//             ans = ans*i;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int fans=fact(6);
//         System.out.println(fans);
//     }
// }


// RECURSIVE METHOD
public class Factorial{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);       
    }
    public static void main(String[] args) {
        int ans =fact(6);
        System.out.println(ans);
    }
}
