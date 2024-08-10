public class RopeCutting {
    public static int maxPices(int n,int a,int b,int c){
        if(n == 0) return 0;
        if(n < 0) return -1;
        int ans = Math.max(Math.max(maxPices(n-a, a, b, c),
        maxPices(n-b, a, b, c)),
        maxPices(n-c, a, b, c));
        if(ans == -1) return -1;
        return ans+1;
    }
    public static void main(String[] args) {
        int result=maxPices(5, 2, 5, 1);
        System.out.println(result);
    }
}
