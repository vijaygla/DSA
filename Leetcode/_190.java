public class _190 {
    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int lsb = n & 1;
            int reverseLsb = lsb << (31 - i);
            ans = ans | reverseLsb;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 0b11111111111111111111111111111101; // Binary literal
        System.out.println(reverseBits(x));
    }
}
