// // Basic Mathed 
// public class Lcm {
//     public static int lcm(int a,int b) {
//         int ans =Math.max(a, b);
//         while (true){
//             if(ans % a==0 && ans % b==0){
//                 break;
//             }
//             ans++;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int result = lcm(12 , 15);
//         System.out.println("LCM = "+result);
//     }
// }




// Efficient Approch 
public class Lcm {
    public static int gcd(int a,int b) {
        int ans = Math.min(a, b);
        while(ans > 0){
            if(a % ans== 0 && b%ans==0){
                break;
            }
            ans--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a=4,b=6;
        int HCF=gcd(a, b);
        int LCM = (a*b)/HCF;
        System.out.println("LCM = "+LCM);
    }
}
