// // Naive Approch
// public class CheckKthBitSet {
//     public static void isSet(int n,int k){
//         int x=1;
//         for(int i=0;i<(k-1);i++){
//             x=x*2;
//             if((n & x) != 0){
//                 System.err.println("yes");
//             }
//             else{
//                 System.err.println("No");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         isSet(8,2);
//     }
// }




// Efficient  Approch 
public class CheckKthBitSet {
    public static void isSet(int n,int k){
        int x = (1 << (k-1));
        if((n & x) != 0) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        isSet(5, 1);
        isSet(8, 2);
        isSet(0, 3);
    }
}
