public class SetUsingOr {
    public static int setBit(int n, int pos) {
        return n | (1 << pos);
    }

    public static void main(String[] args) {
        int n = 5; // 0101 in binary
        int pos = 1;
        int result = setBit(n, pos);
        System.out.println("Result after setting bit at position " + pos + ": " + result);
    }
}

