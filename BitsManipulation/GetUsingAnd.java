public class GetUsingAnd {
    // Returns the bit at position 'pos' in 'num'
    public static int getBit(int num, int pos) {
        return (num & (1 << pos)) != 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        int num = 5; // 0101 in binary
        int pos = 2;
        System.out.println("Bit at position " + pos + " is: " + getBit(num, pos));
    }
}
