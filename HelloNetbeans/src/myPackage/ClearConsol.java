// how to clear the consol in Java
// date: 12-07-14
package myPackage;

import java.io.IOException;

public class ClearConsol {

    public static void main(String[] args) {

        int i = 1;
        do {
            printSomething();
            clrConsol();
            
        } while (i++ <= 3);
    }

    // this methods clear the console
    static void clrConsol() {

        // just prints some blank "new lines"
        for (int i = 1; i <= 40; i++) {
            System.out.println();
        }
        
    }

    // this methods write some data on screen
    static void printSomething() {

        for (int i = 1; i <= 7; i++) {
            System.out.println("clear the console!!!");
        }
    }
}
