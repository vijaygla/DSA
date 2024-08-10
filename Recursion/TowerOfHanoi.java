public class TowerOfHanoi {
    public static void TOH(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }
        TOH(n - 1, a,c,b); // Move n-1 disks from A to B using C as auxiliary
        System.out.println("Move " + n + " from " + a + " to " + c); // Move nth disk from A to C
        TOH(n - 1, b,a,c); // Move n-1 disks from B to C using A as auxiliary
    }

    public static void main(String[] args) {
        TOH(2, 'A', 'B', 'C'); // Calling the function with correct parameters
    }
}
