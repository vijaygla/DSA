public class RightShift {
    public static void main(String[] args) {
        int x=-5,y=2,z=9;

        // for Signed number 

        // right shift of x by 1
        System.out.println("Right Shift of "+x+" = "+(x>>1));
        // right shift of y by 1
        System.out.println("Right Shift of "+y+" = "+(y>>1));
        // right shift of z by 2
        System.out.println("Right Shift of "+z+" = "+(z>>2));


        //  For Unsigned number use >>>
        System.out.println("Right Shift = " +(x >>> 1));
        
    }
}
