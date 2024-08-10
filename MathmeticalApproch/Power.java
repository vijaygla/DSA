// // Naive Approch
// public class Power {
//     // Function to calculate the power
//     public static int power(int x,int n){
//         int ans=1;
//         for(int i=0;i<n;i++){
//             ans = ans * x;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int x= 2, n=3;
//         int result = power(x, n);
//         System.out.println(x+"^"+n+" = "+result);
//     }
// }





// // Efficient Approch 
// public class Power {
//     // Function to calculate the power
//     public static int power(int x,int n){
//         if(n==0) return 1;
//         int temp=power(x, n/2);
//         temp = temp*temp;
//         if(n%2==0){
//             return temp;
//         }
//         else{
//             return temp*x;
//         }
//     }
//     public static void main(String[] args) {
//         int x=2,n=3;
//         int result = power(x, n);
//         System.out.println(x+"^"+n+" = "+result);
//     }
// }





// Most Efficient Approch
public class Power {
    // Function to claculate the power
    public static int power(int x,int n){
        int ans = 1;
        while(n>0){
            ans = ans * x;
            x=x*x;
            n=n/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=5,n=3;
        int result = power(x, n);
        System.out.println(x+"^"+n+" = "+result);
    }
}


