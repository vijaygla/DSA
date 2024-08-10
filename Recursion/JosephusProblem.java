public class JosephusProblem {
    public static int jProblem(int n,int k){
        if(n == 1){
            return 0;
        }
        else{
            return (jProblem(n-1, k) + k)%n;
        }
    }
    public static void main(String[] args) {
        int result1 = jProblem(4,2);
        System.out.println(result1);  // 0
        int result2 = jProblem(7, 3);
        System.out.println(result2);  // 3
    }
}
