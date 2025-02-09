package packageFolder2;

import packageFolder.*;

public class DemoPackage2 {
    public static void main(String[] args) {
        // Instant Method Calling
        DemoPackage d = new DemoPackage();
        d.printHello();

        // Static method calling without making object of class name
        DemoPackage.printMyName("Vijay Kumar");

        // Print Even number by calling other function from other package 
        PrintEven.printEven(15, 25);
    }
}

