package packageFolder2;

import packageFolder.DemoPackage;

public class DemoPackage2 {
    public static void main(String[] args) {

        // Instant Method Calling
        DemoPackage d = new DemoPackage();
        d.printHello();

        // Static method calling without making object of class name
        DemoPackage.printMyName("Vijay Kumar");
    }
}

