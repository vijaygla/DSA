// // Normal method to find hcf
// public class Hcf {
//     public static int gcd(int a,int b){
//         int ans=Math.min(a, b);
//         while(ans > 0){
//             if(a%ans==0 && b%ans==0){
//                 break;
//             }else{
//                 ans--;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int result = gcd(42, 66);
//         System.out.println("HCF = "+result);
//     }
// }




// // Euclidean Approch 
// public class Hcf {
//     public static int gcd(int a,int b) {
//         while(a != b) {
//             if(a>b) a=a-b;
//             else b=b-a;
//         }
//         return a;
//     }
//     public static void main(String[] args) {
//         int result = gcd(42, 66);
//         System.out.println("HCF = "+result);
//     }
// }



// Efficient Approch---Recursive Approch---
public class Hcf {
    public static int gcd(int a,int b) {
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a/b);
        }
    }
    public static void main(String[] args) {
        int result = gcd(4, 6);
        System.out.println("HCF = "+result);
    }
}
